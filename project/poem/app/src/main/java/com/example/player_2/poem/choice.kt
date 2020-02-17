package com.example.player_2.poem

import android.content.Intent
import android.graphics.Typeface
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_choice.*

class choice : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choice)
        var c_font = Typeface.createFromAsset(getAssets(), "font/poem_fontstyle.ttf")
        pc1.typeface = c_font
        pc2.typeface = c_font
        pd1.typeface = c_font
        pd2.typeface = c_font
        pd3.typeface = c_font
        pd4.typeface = c_font
    }

    fun random_choice(view: View){  //隨機生成
        val intent = Intent()
        intent.setClass(this@choice, random_poem_maker::class.java!!)
        startActivity(intent)
    }

    fun designation_choice(view: View){     //生成藏頭詩
        val intent = Intent()
        intent.setClass(this@choice, designation_poem_maker::class.java!!)
        startActivity(intent)
    }

}
