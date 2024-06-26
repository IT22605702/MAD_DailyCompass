package com.example.taskapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class OnboardScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboard_screen)

        val letdoBtn: Button = findViewById(R.id.letsDoBtn)
        letdoBtn.setOnClickListener {
            val intent = Intent(this@OnboardScreen, HomeScreen::class.java)
            startActivity(intent)
            finish() // Optional, to close the current activity after navigation
        }
    }
}
