package com.example.projetokotlin.model

class Pedido (var produtos: ArrayList<Produto> = ArrayList<Produto>(), var frete: Double = 0.0) {

    fun add(produto: Produto) = this.produtos.add(produto)

    fun getValorTotal(): Double {
        var total = 0.0
        if(produtos.size <= 0) throw Exception("Pedido deve ter pelo menos um produto")
        for(produto in produtos){
            total += produto.preco
        }
        return total+frete
    }

    fun getQuantidade():Int = produtos.size
}