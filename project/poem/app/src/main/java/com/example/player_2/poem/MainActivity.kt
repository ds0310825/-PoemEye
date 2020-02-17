package com.example.player_2.poem

import android.content.Intent
import android.graphics.Typeface
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

//雖然叫做MainActivity
//但一點都不Main

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var c_font = Typeface.createFromAsset(assets, "font/poem_fontstyle.ttf")
        button.typeface = c_font
    }

    fun start(view: View){
        val intent = Intent()
        intent.setClass(this@MainActivity, choice::class.java!!)
        startActivity(intent)
    }

}
