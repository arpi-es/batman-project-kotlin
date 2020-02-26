package com.example.project.batman.service.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.project.batman.service.model.Movie
import com.example.project.batman.service.model.Search
import com.example.project.batman.service.model.SearchResult
import com.example.project.batman.service.repository.room.SearchDao
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ProjectRepository(private val searchDao: SearchDao) {
    private val imdbService: IMDBService

    init {
        val retrofit = Retrofit.Builder()
                .baseUrl(IMDBService.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()

        imdbService = retrofit.create(IMDBService::class.java)
    }

    fun getMovieList(sSearch: String): LiveData<List<Search>> {
        val data = MutableLiveData<List<Search>>()

        imdbService.getMovieList(sSearch).enqueue(object : Callback<SearchResult> {
            override fun onResponse(call: Call<SearchResult>, response: Response<SearchResult>) {
                data.value = response.body().search
            }

            override fun onFailure(call: Call<SearchResult>, t: Throwable) {
                data.value = null
            }
        })

        return data
    }

    fun getMovieDetails(sImdbID: String): LiveData<Movie> {
        val data = MutableLiveData<Movie>()

        imdbService.getMovieDetails(sImdbID).enqueue(object : Callback<Movie> {
            override fun onResponse(call: Call<Movie>, response: Response<Movie>) {
                data.value = response.body()
            }

            override fun onFailure(call: Call<Movie>, t: Throwable) {
                data.value = null
            }
        })

        return data
    }
}
