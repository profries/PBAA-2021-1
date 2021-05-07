package com.example.projetoroom.model.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.projetoroom.model.entity.Produto

@Dao
interface ProdutoDao {
    @Query("SELECT * FROM produto")
    fun getAll(): List<Produto>

    @Insert
    fun insert(vararg produtos: Produto)
}
