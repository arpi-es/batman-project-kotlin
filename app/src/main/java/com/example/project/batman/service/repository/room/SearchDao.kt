package com.example.project.batman.service.repository.room

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.project.batman.service.model.Search


@Dao
interface SearchDao {

    @Query("SELECT * FROM tblSearch")
    fun getAll(): LiveData<List<Search>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insertAll(lstItems: List<Search>)

}