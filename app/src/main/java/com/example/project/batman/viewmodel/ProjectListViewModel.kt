package com.example.project.batman.viewmodel

import android.app.Application
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.project.batman.service.model.Search
import com.example.project.batman.service.repository.ProjectRepository


class ProjectListViewModel(application: Application) : AndroidViewModel(application) {

    val movieListObservable: LiveData<List<Search>>

    init {
        movieListObservable = ProjectRepository.getMovieList("batman")

    }





}
