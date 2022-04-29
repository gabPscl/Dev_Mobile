package com.example.projet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val boxclick = findViewById<Button>(R.id.boxBTN)
        boxclick.setOnClickListener {
            val intent = Intent(this, BOX::class.java)
            startActivity(intent)
        }

        val planclick = findViewById<Button>(R.id.planningBTN)
        planclick.setOnClickListener {
            val intent = Intent(this, PLANNING::class.java)
            startActivity(intent)
        }

        val chevclick = findViewById<Button>(R.id.chevBTN)
        chevclick.setOnClickListener {
            val intent = Intent(this, CHEVAUX::class.java)
            startActivity(intent)
        }

    }
}