package com.example.projetologinx

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.Toast
import com.example.projetologinx.model.Usuario

class MainActivity : AppCompatActivity() {
    var listaUsuarios = ArrayList<Usuario>()

    object Constantes {
        const val ACTIVITY_BEM_VINDO = 1
        const val USUARIO = "Usuario"
        const val SENHA = "Senha"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        iniciaListaUsuarios()
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

        if(listaUsuarios.contains(Usuario(nomeString, senhaString))){
            Toast.makeText(this,
                    this.getString(R.string.msg_ok_login), Toast.LENGTH_SHORT).show();

            var intent = Intent(this, BemVindoActivity::class.java).apply {
                putExtra(Constantes.USUARIO, nomeString)
            }

            startActivityForResult(intent, Constantes.ACTIVITY_BEM_VINDO)

        }
        else {
            Toast.makeText(this,
                    this.getString(R.string.msg_error_login), Toast.LENGTH_SHORT).show();
        }

        editTextNome.setText("")
        editTextSenha.setText("")

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if(requestCode == Constantes.ACTIVITY_BEM_VINDO) {
            if(resultCode == Activity.RESULT_OK){
                val username = data?.getStringExtra(Constantes.USUARIO)
                val senha = data?.getStringExtra(Constantes.SENHA)

                Log.d("UpdateUser", "Usuario: $username")
                Log.d("UpdateUser", "Senha: $senha")

                if (senha != null) {
                    listaUsuarios.find {it.nome.equals(username)}?.senha= senha
                }
            }
        }
    }

}