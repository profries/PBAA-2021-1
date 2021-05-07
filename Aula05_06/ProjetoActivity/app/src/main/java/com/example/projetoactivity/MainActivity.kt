package com.example.projetoactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("Ciclo de Vida", "Create")
    }

    override fun onStart() {
        super.onStart()
        Log.d("Ciclo de Vida", "Start")

    }

    override fun onResume() {
        super.onResume()
        Log.d("Ciclo de Vida", "Resume")
    }


    override fun onPause() {
        super.onPause()
        Log.d("Ciclo de Vida", "Pause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Ciclo de Vida", "Stop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Ciclo de Vida", "Restart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Ciclo de Vida", "Destroy")
    }
}