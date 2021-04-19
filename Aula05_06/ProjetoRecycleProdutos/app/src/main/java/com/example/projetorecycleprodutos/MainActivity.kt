package com.example.projetorecycleprodutos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.projetorecycleprodutos.adapter.ProdutoAdapter
import com.example.projetorecycleprodutos.model.Produto

class MainActivity : AppCompatActivity(), ProdutoAdapter.MyItemClickListener {

    var produtos = ArrayList<Produto>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        iniciaListaProdutos()

        val viewManager = LinearLayoutManager(this)
        var viewAdapter = ProdutoAdapter(produtos)

        viewAdapter.onItemClickListener = this

        var recyclerView = findViewById<RecyclerView>(R.id.recycleViewProdutos).apply {
            setHasFixedSize(true)
            layoutManager = viewManager
            adapter = viewAdapter
        }


    }

    override fun onItemClick(view: View, position: Int) {
        Toast.makeText(this, produtos.get(position).nome,Toast.LENGTH_SHORT).show()
    }

    private fun iniciaListaProdutos() {
        produtos.add(Produto("Prod1",30.0))
        produtos.add(Produto("Prod2",60.0))
        produtos.add(Produto("Prod3",80.0))
        produtos.add(Produto("Prod4",90.0))
        produtos.add(Produto("Prod5",80.0))
        produtos.add(Produto("Prod6",90.0))
        produtos.add(Produto("Prod7",80.0))
        produtos.add(Produto("Prod8",90.0))
        produtos.add(Produto("Prod9",80.0))
        produtos.add(Produto("ProdA",90.0))
        produtos.add(Produto("ProdB",80.0))
        produtos.add(Produto("ProdC",90.0))
        produtos.add(Produto("ProdD",80.0))
        produtos.add(Produto("ProdE",90.0))
        produtos.add(Produto("ProdF",80.0))
        produtos.add(Produto("ProdG",90.0))
        produtos.add(Produto("ProdH",80.0))
        produtos.add(Produto("ProdI",90.0))
        produtos.add(Produto("ProdJ",80.0))
        produtos.add(Produto("ProdK",120.0))
        produtos.add(Produto("ProdL",80.0))
        produtos.add(Produto("ProdM",90.0))
        produtos.add(Produto("ProdN",80.0))
        produtos.add(Produto("ProdO",90.0))
        produtos.add(Produto("ProdP",80.0))
        produtos.add(Produto("ProdQ",90.0))
        produtos.add(Produto("ProdR",80.0))
        produtos.add(Produto("ProdS",90.0))
        produtos.add(Produto("ProdT",80.0))
        produtos.add(Produto("ProdU",90.0))
    }


}