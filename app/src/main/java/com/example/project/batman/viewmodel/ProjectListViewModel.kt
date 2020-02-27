package com.example.project.batman.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.viewModelScope
import com.example.project.batman.service.model.Search
import com.example.project.batman.service.repository.ProjectRepository
import com.example.project.batman.service.repository.room.AppDatabase


class ProjectListViewModel(application: Application) : AndroidViewModel(application) {
    private val repository: ProjectRepository
    val movieListObservable: LiveData<List<Search>>

    init {

        val searchDao = AppDatabase.getDatabase(application, viewModelScope).searchDao()
        val movieDao = AppDatabase.getDatabase(application, viewModelScope).movieDao()
        repository = ProjectRepository(searchDao, movieDao )
        movieListObservable = repository.getMovieList("batman")

    }




}
