package com.example.assignment_01

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class S2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_s2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val yt = findViewById<CardView>(R.id.yt)
        val sp = findViewById<CardView>(R.id.sp)
        val wk = findViewById<CardView>(R.id.wk)
        val x = findViewById<CardView>(R.id.x)
        val ins = findViewById<CardView>(R.id.ins)
        val zo = findViewById<CardView>(R.id.zo)
        val Button = findViewById<Button>(R.id.btn2)


        yt.setOnClickListener {
            openLink("https://www.youtube.com")
        }

        sp.setOnClickListener {
            openLink("https://www.spotify.com")
        }

        wk.setOnClickListener {
            openLink("https://www.wikipedia.org")
        }

        x.setOnClickListener {
            openLink("https://twitter.com")
        }

        ins.setOnClickListener {
            openLink("https://instagram.com")
        }

        zo.setOnClickListener {
            openLink("https://www.zomato.com")
        }

        Button.setOnClickListener {
            openLink("https://github.com/KaranPrAsAd23")
        }
    }

    private fun openLink(url: String) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        startActivity(intent)
    }
            
        }


