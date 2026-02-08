package com.example.explictintent

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.widget.Button
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val btnEx = findViewById<Button>(R.id.button)
        btnEx.setOnClickListener {

            // Open a new screen!!
            intent = Intent(applicationContext, Second_Screen::class.java)
            startActivity(intent)
        }
    }
}
