package com.example.fullyfunctionalapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView


class SkillsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skills)

        val android = findViewById<CardView>(R.id.cvAndroidDevelopment)
        val web = findViewById<CardView>(R.id.cvWebDevelopment)
        val ios = findViewById<CardView>(R.id.cvIosDevelopment)
        val ml = findViewById<CardView>(R.id.cvMLDevelopment)
        val blockchain = findViewById<CardView>(R.id.cvBlockchainDevelopment)
        val web3 = findViewById<CardView>(R.id.cvWeb3Development)
        val button = findViewById<Button>(R.id.btnCall)

        button.setOnClickListener{
            val intent: Intent = Intent(Intent.ACTION_DIAL)
            intent.setData(Uri.parse("tel:9664067092"))
            startActivity(intent)
        }


    }
}