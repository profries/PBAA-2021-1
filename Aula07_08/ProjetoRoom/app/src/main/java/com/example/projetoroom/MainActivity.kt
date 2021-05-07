package com.example.projetoroom

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.room.Room
import com.example.projetoroom.model.db.AppDatabase
import com.example.projetoroom.model.entity.Produto
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun onResume(){
        super.onResume()
        val db = Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java, "produtos"
        ).build()


        //Adicionada Coroutines para permitir concorrëncia (semelhante a Thread) - para evitar o erro de executar na Thread principal
        //GlobalScope não é muito recomendado na prática
        GlobalScope.launch {
            val dao = db.produtoDao()

            dao.insert(Produto(0, "Prod1", 30.0))

            Log.d("BD", dao.getAll()[0].nome)
        }
    }
}