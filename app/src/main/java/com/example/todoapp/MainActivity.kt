package com.example.todoapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val gsbutton: Button = findViewById(R.id.gsbutton)
        gsbutton.setOnClickListener {
            // Start the next activity
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }

    }
}