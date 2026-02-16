package com.example.cafedemoapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.cafedemoapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    companion object{
        const val KEY = "com.example.cafedemoapp.KEY"
    }

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        enableEdgeToEdge()

        ViewCompat.setOnApplyWindowInsetsListener(binding.main) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(
                systemBars.left,
                systemBars.top,
                systemBars.right,
                systemBars.bottom
            )
            insets
        }


        binding.btnO.setOnClickListener {

            val orderList =
                binding.T1.text.toString() + "\n" +
                        binding.T2.text.toString() + "\n" +
                        binding.T3.text.toString()

            val intent = Intent(this, s2::class.java)
            intent.putExtra("OrderList", orderList)
            startActivity(intent)
        }
    }
}
