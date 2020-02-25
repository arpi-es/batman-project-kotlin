package com.example.project.batman.view.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders

import com.example.project.batman.R
import com.example.project.batman.service.model.Search
import com.example.project.batman.view.adapter.MovieAdapter
import com.example.project.batman.view.callback.MovieClickCallback
import com.example.project.batman.viewmodel.ProjectListViewModel
import com.example.project.batman.databinding.FragmentProjectListBinding


class ProjectListFragment : Fragment() {
    private var movieAdapter: MovieAdapter? = null
    private var binding: FragmentProjectListBinding? = null

    companion object {
        val TAG = "MovieListFragment"
    }

    private val movieClickCallback = object : MovieClickCallback {
        override fun onClick(search: Search) {
            if (lifecycle.currentState.isAtLeast(Lifecycle.State.STARTED)) {
            (activity as MainActivity).show(search)
          }
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_project_list, container, false)

        movieAdapter = MovieAdapter(movieClickCallback)
        binding!!.projectList.adapter = movieAdapter
        binding!!.isLoading = true

        return binding!!.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        val viewModel = ViewModelProviders.of(this).get(ProjectListViewModel::class.java)
        observeViewModel(viewModel)
    }

    private fun observeViewModel(viewModel: ProjectListViewModel) {

        viewModel.movieListObservable.observe(this, Observer { lstSearch ->
            if (lstSearch != null) {
                binding!!.isLoading = false
                movieAdapter!!.setMovieList(lstSearch)
            }
        })
    }


}
