package com.example.exemplolog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i("======>", "ON CREATE EXECUTADO")
    }

    override fun onStart() {
        super.onStart()
        Log.i("======>", "ON START EXECUTADO")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("======>", "ON DESTROY EXECUTADO")
    }

    override fun onStop() {
        super.onStop()
        Log.i("======>", "ON STOP EXECUTADO")
    }
}