package com.example.projetologin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.Toast
import com.example.projetologin.model.Usuario

class MainActivity : AppCompatActivity() {
    var listaUsuarios = ArrayList<Usuario>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.iniciaListaUsuarios()
        setContentView(R.layout.activity_main)
    }

    private fun iniciaListaUsuarios(){
        listaUsuarios.add(Usuario("user1","senha1"))
        listaUsuarios.add(Usuario("user2","senha2"))
        listaUsuarios.add(Usuario("user3","senha3"))
    }

    fun realizaLogin(view: View){

        var editTextNome = findViewById<EditText>(R.id.editNome)
        var editTextSenha = findViewById<EditText>(R.id.editSenha)

        val nomeString = editTextNome.text.toString()
        val senhaString = editTextSenha.text.toString()

        Log.i("Login-Nome",nomeString)
        Log.i("Login-Senha",senhaString)

        if(listaUsuarios.contains(Usuario(nomeString, senhaString))){
            Toast.makeText(this,
                this.getString(R.string.msg_ok_login), Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(this,
                this.getString(R.string.msg_error_login), Toast.LENGTH_SHORT).show();
        }

        editTextNome.setText("")
        editTextSenha.setText("")

    }
}