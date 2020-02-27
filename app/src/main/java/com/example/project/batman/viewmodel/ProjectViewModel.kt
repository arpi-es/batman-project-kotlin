@file:Suppress("UNCHECKED_CAST")

package com.example.project.batman.viewmodel

import android.app.Application
import androidx.databinding.ObservableField
import androidx.lifecycle.*
import com.example.project.batman.service.model.Movie
import com.example.project.batman.service.repository.ProjectRepository
import com.example.project.batman.service.repository.room.AppDatabase


class ProjectViewModel(application: Application, private val sImdbID: String) : AndroidViewModel(application) {


    private val repository: ProjectRepository

    val observableProject: LiveData<Movie>

    var movie = ObservableField<Movie>()

    init {
        val searchDao = AppDatabase.getDatabase(application, viewModelScope).searchDao()
        val movieDao = AppDatabase.getDatabase(application, viewModelScope).movieDao()
        repository = ProjectRepository(searchDao,movieDao)
        observableProject = repository.getMovieDetails(sImdbID)
    }

    fun setProject(movie: Movie ) {
        this.movie.set(movie)
    }

    class Factory(private val application: Application, private val sImdbID: String) : ViewModelProvider.NewInstanceFactory() {
        override fun <T : ViewModel> create(modelClass: Class<T>): T {


            if (modelClass.isAssignableFrom(ProjectViewModel::class.java)) {
                return ProjectViewModel(application, sImdbID) as T
            }
            throw IllegalArgumentException("Unknown ViewModel class")

        }
    }
}



