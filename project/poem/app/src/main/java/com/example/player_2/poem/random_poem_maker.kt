package com.example.player_2.poem

import android.content.Intent
import android.graphics.Typeface
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.example.player_2.poem.writer.poem.write_poem
import kotlinx.android.synthetic.main.activity_random_poem_maker.*


class random_poem_maker : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_random_poem_maker)

        var c_font = Typeface.createFromAsset(assets, "font/poem_fontstyle.ttf")
        button3.typeface = c_font
        rp1.typeface = c_font
        rp2.typeface = c_font
        back2.typeface = c_font

        val poem = write_poem()     //初始的生成動作          對，我知道可以直接用底下的restart
        val result = poem.split("。")
        rp1.text = result[0]
        rp2.text = result[1]
    }

    fun restart(view: View){    //重新生成
        val poem = write_poem()
        val result = poem.split("。")
        rp1.text = result[0]
        rp2.text = result[1]
    }

    fun back(view: View){
        val intent = Intent()
        intent.setClass(this@random_poem_maker, choice::class.java!!)
        startActivity(intent)
    }
}
