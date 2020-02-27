package com.example.project.batman.view.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.project.batman.R

import com.example.project.batman.viewmodel.MovieDetailViewModel
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.project.batman.databinding.FragmentMovieDetailBinding

class MovieDetailFragment : Fragment() {
    private var binding: FragmentMovieDetailBinding? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_movie_detail, container, false)
        return binding!!.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)


        val factory = MovieDetailViewModel.Factory(activity!!.application, arguments!!.getString(KEY_MOVIE_ID))


        val viewModel = ViewModelProviders.of(this, factory).get(MovieDetailViewModel::class.java)

        binding!!.projectViewModel = viewModel
        binding!!.isLoading = true

        observeViewModel(viewModel)
    }

    private fun observeViewModel(viewModel: MovieDetailViewModel) {
        // Observe project data
        viewModel.observableProject.observe(this, Observer { project ->
            if (project != null) {
                binding!!.isLoading = false
                viewModel.setProject(project)
            }
        })
    }

    companion object {
        private const val KEY_MOVIE_ID = "movie_id"

        fun forProject(sID: String): MovieDetailFragment {
            val fragment = MovieDetailFragment()
            val args = Bundle()

            args.putString(KEY_MOVIE_ID, sID)
            fragment.arguments = args

            return fragment
        }
    }
}
