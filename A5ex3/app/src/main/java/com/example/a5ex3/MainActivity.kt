package com.example.a5ex3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun mensagem(view: View){
        val txtNome = findViewById<EditText>(R.id.txtNome)
        title = txtNome.text
        Toast.makeText(this, txtNome.text, Toast.LENGTH_LONG).show()
    }

}