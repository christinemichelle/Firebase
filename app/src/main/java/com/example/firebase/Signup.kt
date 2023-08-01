package com.example.firebase

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Signup : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)


        var name = findViewById<TextView>(R.id.tvName)
        var email = findViewById<TextView>(R.id.gmail)
        var contact = findViewById<TextView>(R.id.phone)
        var password = findViewById<TextView>(R.id.password)
        var button = findViewById<Button>(R.id.btnsignup)
        button.setOnClickListener {

        }
    }
}