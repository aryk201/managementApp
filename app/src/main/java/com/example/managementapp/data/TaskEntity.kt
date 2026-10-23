package com.example.managementapp.data

import androidx.room.Entity
import androidx.room.PrimaryKey

// Memberitahu Room bahwa class ini adalah tabel
@Entity(tableName = "table_tasks")
data class TaskEntity(
    // Menambahkan primary key
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0,

    // Kolom tabel
    var mapel: String,
    var judulTugas: String,
    var deskripsi: String,
    var estTime: Int = 0
)