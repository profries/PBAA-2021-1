package com.example.projetospinnerpaises

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewParent
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast

class MainActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var spinner = findViewById<Spinner>(R.id.spinnerPaises)

        var arrayAdapter = ArrayAdapter.createFromResource(this,
                R.array.lista_paises,
                android.R.layout.simple_spinner_dropdown_item)

        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)


        spinner.setAdapter(arrayAdapter)

        spinner.setSelection(0, false)

        spinner.setOnItemSelectedListener(this)
    }

    override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
        if(position > 0) {
            Toast.makeText(this,
                    parent.getItemAtPosition(position).toString(),
                    Toast.LENGTH_SHORT)
                .show();
        }
    }

    override fun onNothingSelected(parent: AdapterView<*>?) {
    }
}