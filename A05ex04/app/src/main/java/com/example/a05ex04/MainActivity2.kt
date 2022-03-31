package com.example.a05ex04

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val a = intent.getStringExtra("NOME")
        val b = intent.getStringExtra("TELEFONE")

        findViewById<TextView>(R.id.txtAviso).text = "valores: $a e $b"
    }
}