package com.example.project.batman.service.repository

import com.example.project.batman.service.model.Movie
import com.example.project.batman.service.model.SearchResult
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

internal interface IMDBService {

    @GET("/?apikey=" + API_KEY)
    fun getMovieList(@Query("s") sSearchText : String) : Call<SearchResult>


    @GET("/?apikey=" + API_KEY)
    fun getMovieDetails(@Query("i") sImdbID : String) : Call<Movie>

    companion object {

        const val BASE_URL = "https://www.omdbapi.com"
        const val API_KEY = "3e974fca"
    }
}
