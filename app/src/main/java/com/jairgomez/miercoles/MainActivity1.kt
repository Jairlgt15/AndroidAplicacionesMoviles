package com.jairgomez.miercoles

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity1 : AppCompatActivity() {
    lateinit var buttonNavegar : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main1)
        buttonNavegar= findViewById(R.id.btnNavegar)
        buttonNavegar.setOnClickListener{
            val intention= Intent(this, MainActivity2::class.java)
            startActivity(intention)
        }
    }
}