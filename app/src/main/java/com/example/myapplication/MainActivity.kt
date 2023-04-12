package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.SeekBar
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        val results = findViewById<TextView>(R.id.results)
        val seekBar = findViewById<SeekBar>(R.id.seekBar)

        button.setOnClickListener {
            val number = Random.nextInt(seekBar.progress+1)
            results.text = number.toString()
        }

    }
}