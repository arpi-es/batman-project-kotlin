package com.example.project.batman.service.repository.room

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.project.batman.service.model.Movie

@Dao
interface MovieDao {

    @Query("SELECT * FROM tblMovie WHERE imdbID = :sImdbID")
    fun getMovie(sImdbID : String): LiveData<Movie>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insertMovie(movie: Movie )


}