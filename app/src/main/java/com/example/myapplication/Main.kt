package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class Main : AppCompatActivity() {

    lateinit var botao: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        botao = findViewById(R.id.confirmarBotao)
        botao.setOnClickListener {
            Toast.makeText(this, "Você clicou no botão", Toast.LENGTH_LONG).show()


        }
    }
}