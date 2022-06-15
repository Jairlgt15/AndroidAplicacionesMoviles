package com.jairgomez.miercoles

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main1)
        val buttonNavegar= findViewById<Button>(R.id.btnNavegar)
        buttonNavegar.setOnClickListener{
            val intention= Intent(this, MainActivity3::class.java)
            startActivity(intention)
        }
    }
}