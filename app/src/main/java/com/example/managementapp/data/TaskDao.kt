package com.example.managementapp.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Dao
interface TaskDAO {
    // Simpan data tugas baru ke DB
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertTask(task: TaskEntity)


    // Menampilkan seluruh data tugas
    @Query("SELECT * FROM table_tasks ORDER BY id ASC")
    fun getAllTasks(): Flow<List<TaskEntity>>
    // Mengupdate data tugas
    @Update
    suspend fun updateTask(task: TaskEntity)
    // Menghapus data tugas
    @Delete
    suspend fun deleteTask(task: TaskEntity)
}


class TaskDAO {