package com.example.projetoroom.model.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.projetoroom.model.dao.ProdutoDao
import com.example.projetoroom.model.entity.Produto

@Database(entities = arrayOf(Produto::class), version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun produtoDao(): ProdutoDao
}
