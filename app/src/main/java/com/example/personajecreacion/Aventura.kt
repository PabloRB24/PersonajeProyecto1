package com.example.personajecreacion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Aventura : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_aventura)

        val personaje : Personaje? = intent.getParcelableExtra("Personaje")



    }
}