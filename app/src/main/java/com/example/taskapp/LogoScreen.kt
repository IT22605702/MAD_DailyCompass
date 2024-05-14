package com.example.taskapp

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class LogoScreen : AppCompatActivity() {
    private val handler = Handler(Looper.getMainLooper())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_logo_screen)

        // Delayed navigation to another activity
        handler.postDelayed({
            startActivity(Intent(this, OnboardScreen::class.java))
            finish()
        }, 2000L) // 5000 milliseconds = 5 seconds
    }
}
