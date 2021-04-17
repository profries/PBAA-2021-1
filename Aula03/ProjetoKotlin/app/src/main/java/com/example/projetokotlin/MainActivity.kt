package com.example.projetokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.projetokotlin.model.Pedido
import com.example.projetokotlin.model.Produto

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val smartphone = Produto(1, "celular", 700.0)
        println("Nome do produto: ${smartphone.nome}")

        var pedido = Pedido()
        pedido.add(Produto(1,"celular", 700.00))
        pedido.add(Produto(2,"tablet",920.00))
        pedido.add(Produto(3,"PC",2400.00))
        pedido.frete = 28.0

        println(pedido.getValorTotal())
        println(pedido.getQuantidade())

    }
}
