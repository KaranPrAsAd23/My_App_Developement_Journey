package com.example.implicit_inten

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

            val linkbutton = findViewById<CardView>(R.id.B1)
            val ytbutton = findViewById<CardView>(R.id.B2)
            val spotibutton = findViewById<CardView>(R.id.B3)

            linkbutton.setOnClickListener {

                val intent = Intent(Intent.ACTION_VIEW)
                intent.data = Uri.parse("https://www.linkedin.com/in/karan-prasad-29826b278/")
                startActivity(intent)

            }

            ytbutton.setOnClickListener {

                val intent = Intent(Intent.ACTION_VIEW)
                intent.data = Uri.parse("https://www.youtube.com/")
                startActivity(intent)


            }

            spotibutton.setOnClickListener {

                val intent = Intent(Intent.ACTION_VIEW)
                intent.data = Uri.parse("https://open.spotify.com/")
                startActivity(intent)

        }
    }
}