package com.example.firebase

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var signup = findViewById<TextView>(R.id.textView11)
        signup.setOnClickListener {
            val intent = Intent(this,Signup::class.java)
            startActivity(intent)
        }

    }
}