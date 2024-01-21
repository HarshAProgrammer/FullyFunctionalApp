package com.example.fullyfunctionalapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        var button = findViewById<Button>(R.id.btnWelcome)

        button.setOnClickListener{
            val intent = Intent(applicationContext,SkillsActivity::class.java)
            startActivity(intent)
        }

    }
}