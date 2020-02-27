package com.example.project.batman.view.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.project.batman.R
import com.example.project.batman.databinding.FragmentProjectDetailsBinding

import com.example.project.batman.viewmodel.MovieDetailViewModel
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders

class MovieDetailFragment : Fragment() {
    private var binding: FragmentProjectDetailsBinding? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate this data binding layout
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_project_details, container, false)

        // Create and set the adapter for the RecyclerView.
        return binding!!.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)


        val factory = MovieDetailViewModel.Factory(activity!!.application, arguments!!.getString(KEY_PROJECT_ID))


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
        private const val KEY_PROJECT_ID = "project_id"

        /** Creates project fragment for specific project ID  */
        fun forProject(projectID: String): MovieDetailFragment {
            val fragment = MovieDetailFragment()
            val args = Bundle()

            args.putString(KEY_PROJECT_ID, projectID)
            fragment.arguments = args

            return fragment
        }
    }
}
