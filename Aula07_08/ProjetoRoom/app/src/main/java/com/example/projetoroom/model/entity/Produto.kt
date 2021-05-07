package com.example.projetoroom.model.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class Produto(
    @PrimaryKey val codigo: Int,
    val nome: String,
    val preco: Double
)