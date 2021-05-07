package com.example.projetoactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView

class Tela2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this)
        val textView = TextView(this)
        textView.text = "Hello World da Tela 2"
        layout.addView(textView)

        setContentView(layout)
    }
}