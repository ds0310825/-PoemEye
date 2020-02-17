package com.example.player_2.poem

import android.content.Context
import android.content.Intent
import android.graphics.Typeface
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.view.inputmethod.InputMethodManager
import com.example.player_2.poem.writer.poem.design_write_poem
import kotlinx.android.synthetic.main.activity_designation_poem_maker.*


//用來生成藏頭詩的

class designation_poem_maker : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_designation_poem_maker)

        val c_font = Typeface.createFromAsset(assets, "font/poem_fontstyle.ttf")
        button2.typeface = c_font
        dp1.typeface = c_font
        dp2.typeface = c_font
        inp.typeface = c_font
        back1.typeface = c_font

        val kb_cont = keyboard_cont()   //呼叫鍵盤
        kb_cont.open(inp)
    }

    fun design_poem(view: View){
        val heads = inp.text.toString()
        val poem = design_write_poem(heads)
        var result = poem.split("。")
        dp1.text = result[0]
        dp2.text = result[1]
        val view = window.peekDecorView()
        if (view != null)   //收起鍵盤
        {
            val inputMethodManager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            inputMethodManager.hideSoftInputFromWindow(view.windowToken, 0)
        }
    }

    fun back(view: View){
        val intent = Intent()
        intent.setClass(this@designation_poem_maker, choice::class.java)
        startActivity(intent)
    }

}
