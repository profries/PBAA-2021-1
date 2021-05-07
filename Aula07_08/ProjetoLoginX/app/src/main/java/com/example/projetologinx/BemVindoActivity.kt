package com.example.projetologinx

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class BemVindoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bem_vindo)

        val usuario = intent.getStringExtra(MainActivity.Constantes.USUARIO)

        var textoBemVindo = findViewById<TextView>(R.id.textoBemVindo)
        textoBemVindo.text = "Bem vindo, ${usuario}"
    }

    fun voltar(view: View){
        setResult(Activity.RESULT_CANCELED)
        finish()
    }

    fun editarSenha(view: View){
        val senhaEditText = findViewById<EditText>(R.id.editTextSenha)
        val senha = senhaEditText.text.toString()

        val usuario = intent.getStringExtra(MainActivity.Constantes.USUARIO)

        var data = Intent().apply{
            putExtra(MainActivity.Constantes.USUARIO, usuario)
            putExtra(MainActivity.Constantes.SENHA, senha)
        }

        setResult(Activity.RESULT_OK, data)
        finish()
    }


}