package com.example.tetris

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button


class MainActivity : AppCompatActivity() {
    var play: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        play = findViewById(R.id.play)
        play.setOnClickListener(View.OnClickListener {
            val intent = Intent(this@MainActivity, Game::class.java)
            startActivity(intent)
        })
    }
}
