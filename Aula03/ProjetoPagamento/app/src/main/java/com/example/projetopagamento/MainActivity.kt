package com.example.projetopagamento

import android.app.AlertDialog
import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast


class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var botaoPagar = findViewById<Button>(R.id.botaoPagar)
        botaoPagar.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        var checkAgua = findViewById<CheckBox>(R.id.checkAgua)
        var checkLuz = findViewById<CheckBox>(R.id.checkLuz)
        var checkTelefone = findViewById<CheckBox>(R.id.checkTelefone)
        var checkCelular = findViewById<CheckBox>(R.id.checkCelular)

        var total = 0;

        if(checkAgua.isChecked())
            total += Integer.parseInt(checkAgua.getTag().toString())
        if(checkLuz.isChecked())
            total += Integer.parseInt(checkLuz.getTag().toString())
        if(checkTelefone.isChecked())
            total += Integer.parseInt(checkTelefone.getTag().toString())
        if(checkCelular.isChecked())
            total += Integer.parseInt(checkCelular.getTag().toString())

        val dialog = AlertDialog.Builder(this)
        dialog.setTitle("Pagamento");
        dialog.setMessage("O valor do pagamento é ${total}. Confirma pagamento?")
        dialog.setPositiveButton("OK", DialogInterface.OnClickListener {
            dialog, id ->
                Toast.makeText(this, "Pagamento realizado com sucesso!", Toast.LENGTH_SHORT).show()
                checkAgua.setChecked(false)
                checkLuz.setChecked(false)
                checkTelefone.setChecked(false)
                checkCelular.setChecked(false)
        })
        dialog.setNegativeButton("Cancelar", DialogInterface.OnClickListener {
                dialog, id ->
            Toast.makeText(this, "Pagamento cancelado!", Toast.LENGTH_SHORT).show()
        })
        dialog.show()
    }


}