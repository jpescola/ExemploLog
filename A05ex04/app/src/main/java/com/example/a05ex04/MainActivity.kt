package com.example.a05ex04

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun cadastrar(view: View){
        val txtNome = findViewById<TextView>(R.id.txtNome)
        val txtTelefone = findViewById<TextView>(R.id.txtTelefone)

        val intent = Intent(this, MainActivity2::class.java).apply {
            putExtra("NOME", txtNome.text.toString())
            putExtra("TELEFONE", txtTelefone.text.toString())
        }
        startActivity(intent)
    }
}