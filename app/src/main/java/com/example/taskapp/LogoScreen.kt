package com.example.taskapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class LogoScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_logo_screen)

//        private val handler = Handler(Looper.getMainLooper())
//
//        override fun onCreate(savedInstanceState: Bundle?) {
//            super.onCreate(savedInstanceState)
//            setContentView(R.layout.activity_main)
//
//            // Delayed navigation to another activity
//            handler.postDelayed({
//                startActivity(Intent(this, PlayActivity::class.java))
//                finish()
//            }, 5000L) // 5000 milliseconds = 5 seconds
//                }
    }

}