@file:Suppress("UNCHECKED_CAST")

package com.example.project.batman.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.databinding.ObservableField
import com.example.project.batman.service.model.Movie
import com.example.project.batman.service.repository.ProjectRepository


class ProjectViewModel(application: Application, private val sImdbID: String) : AndroidViewModel(application) {

    val observableProject: LiveData<Movie>

    var movie = ObservableField<Movie>()

    init {
        observableProject = ProjectRepository.getMovieDetails(sImdbID)
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



