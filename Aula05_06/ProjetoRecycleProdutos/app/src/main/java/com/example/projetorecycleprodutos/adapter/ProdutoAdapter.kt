package com.example.projetorecycleprodutos.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.projetorecycleprodutos.R
import com.example.projetorecycleprodutos.model.Produto

class ProdutoAdapter (var listaProdutos: ArrayList<Produto>): RecyclerView.Adapter<ProdutoAdapter.MyViewHolder>(){
    var onItemClickListener: MyItemClickListener? = null

    class MyViewHolder: RecyclerView.ViewHolder {
        var textViewNome: TextView
        var textViewPreco: TextView
        constructor(view: View) : super(view) {
            textViewNome = view.findViewById(R.id.textViewNome)
            textViewPreco = view.findViewById(R.id.textViewPreco)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.getContext())
            .inflate(R.layout.item_produto, parent, false)
        return MyViewHolder(view)
    }
    
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.textViewNome.text = listaProdutos.get(position).nome
        holder.textViewPreco.text = listaProdutos.get(position).preco.toString()
        holder.itemView.setOnClickListener{
            onItemClickListener?.onItemClick(holder.itemView, position)
        }
    }

    override fun getItemCount() = listaProdutos.size

    interface MyItemClickListener {
        fun onItemClick(view: View, position: Int)
    }
}