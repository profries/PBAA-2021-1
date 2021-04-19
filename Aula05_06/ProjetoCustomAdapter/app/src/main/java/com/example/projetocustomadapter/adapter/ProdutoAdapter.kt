package com.example.projetocustomadapter.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.example.projetocustomadapter.R
import com.example.projetocustomadapter.model.Produto

class ProdutoAdapter (var contexto: Context, var listaProdutos: ArrayList<Produto>): BaseAdapter()
{
    override fun getCount(): Int {
        return listaProdutos.size
    }

    override fun getItem(position: Int): Any {
        return listaProdutos.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var view: View = LayoutInflater.from(contexto).inflate(R.layout.item_produto, parent, false)

        var textViewNome = view.findViewById<TextView>(R.id.textNome)
        var textViewPreco = view.findViewById<TextView>(R.id.textPreco)

        val produto = listaProdutos.get(position)

        textViewNome.text = produto.nome
        textViewPreco.text = produto.preco.toString()

        return view
    }

}