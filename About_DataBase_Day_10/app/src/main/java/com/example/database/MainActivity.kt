package com.example.database

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText
import com.google.firebase.database.FirebaseDatabase

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val email = findViewById<TextInputEditText>(R.id.etmail)
        val password = findViewById<TextInputEditText>(R.id.etpass)
        val signupBtn = findViewById<Button>(R.id.sbtn)

        val database = FirebaseDatabase.getInstance().reference

        signupBtn.setOnClickListener {

            val mailText = email.text.toString()
            val passText = password.text.toString()

            val userId = database.child("Users").push().key

            val user = User(mailText, passText)

            database.child("Users").child(userId!!)
                .setValue(user)

            Toast.makeText(this, "Data Stored", Toast.LENGTH_SHORT).show()

            email.text?.clear()
            password.text?.clear()
        }
    }
}