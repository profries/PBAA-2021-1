package com.example.projetokotlin.model

import org.junit.Test

import org.junit.Assert.*

class PedidoTest {

    @Test
    fun getValorTotalComSucesso() {
        var pedido = Pedido()
        pedido.add(Produto(1,"celular", 700.00))
        pedido.add(Produto(2,"tablet",920.00))
        pedido.add(Produto(3,"PC",2400.00))
        pedido.frete = 28.0

        val valorEsperado = 4048.0

        assertEquals(valorEsperado, pedido.getValorTotal(), 0.0)
    }

    @Test(expected = Exception::class)
    //@Test
    fun getValorTotalComErroQuantProdutoZero(){
        var pedido = Pedido()
    //    try {
            var valor = pedido.getValorTotal()
    //        fail("Quantidade de produtos igual a 0, deveria ter gerado excecao")
    //    } catch (ex: Exception){
            //assertNotNull(ex)
    //        assertEquals(ex.message, "Pedido deve ter pelo menos um produto")
    //    }
    }

    @Test
    fun getQuantidadeComSucesso() {
        var pedido = Pedido()
        pedido.add(Produto(1,"celular", 700.00))
        pedido.add(Produto(2,"tablet",920.00))
        pedido.add(Produto(3,"PC",2400.00))

        val valorEsperado = 3
        assertEquals(valorEsperado, pedido.getQuantidade())

    }
}