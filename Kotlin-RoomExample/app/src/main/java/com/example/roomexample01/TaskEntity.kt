package com.example.roomexample01

import androidx.room.Entity
import androidx.room.PrimaryKey
import org.jetbrains.annotations.NotNull

// NÚMERO 1
@Entity(tableName = "task_table")
// REPRESENTA LA CLASE
data class TaskEntity(
    @PrimaryKey(autoGenerate = true)
    @NotNull
    val id: Int = 0,
    val title: String,
    val descripcion: String,
    val author: String
)