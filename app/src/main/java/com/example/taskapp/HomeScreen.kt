package com.example.taskapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class HomeScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_screen)

        val letdoBtn: ImageView = findViewById(R.id.imageView10)
        letdoBtn.setOnClickListener {
            val intent = Intent(this@HomeScreen, MainActivity::class.java)
            startActivity(intent)
            finish() // Optional, to close the current activity after navigation
        }
    }
}