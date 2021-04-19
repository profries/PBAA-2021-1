package com.example.projetolistapaises

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.*

class MainActivity : AppCompatActivity() {
    var listaPaises = ArrayList<String>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        iniciaListaPaises()

        //Puxar o ListView
        var listViewPaises = findViewById<ListView>(R.id.listViewPaises)

        var arrayAdapter = ArrayAdapter(this,
            android.R.layout.simple_list_item_1, listaPaises)

        listViewPaises.adapter = arrayAdapter

        //Tratar o evento setOnItemClickListener
        listViewPaises.setOnItemClickListener {
            parent, view, position, id ->
                Toast.makeText(this, listaPaises[position], Toast.LENGTH_SHORT).show()
                Log.i("ID", parent.getItemIdAtPosition(position).toString())
            //Toast.makeText(this, parent.getItemAtPosition(position).toString(), Toast.LENGTH_SHORT).show()
            //listaPaises.add("Franca")
            //arrayAdapter.notifyDataSetChanged()
        }

    }

    private fun iniciaListaPaises() {
        listaPaises.add("Argentina")
        listaPaises.add("Brasil")
        listaPaises.add("Chile")
        listaPaises.add("Dinamarca")
        listaPaises.add("Equador")
    }
}