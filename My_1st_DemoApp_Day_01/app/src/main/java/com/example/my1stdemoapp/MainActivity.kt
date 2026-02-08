package com.example.my1stdemoapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val buttonDownload = findViewById<Button>(R.id.btnDownload)
        val buttonUpload = findViewById<Button>(R.id.btnUpload)

        buttonDownload.setOnClickListener {
            Toast.makeText(applicationContext, "Downloading...." , Toast.LENGTH_SHORT).show()
        }
        buttonUpload.setOnClickListener{
            Toast.makeText(applicationContext, "Uploading...." , Toast.LENGTH_SHORT).show()
        }

    }
}