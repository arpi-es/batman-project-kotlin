package com.example.project.batman.view.ui

import android.os.Bundle

import com.example.project.batman.R
import androidx.appcompat.app.AppCompatActivity
import com.example.project.batman.service.model.Search


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            val fragment = MovieListFragment()
            supportFragmentManager.beginTransaction().add(R.id.fragment_container, fragment, MovieListFragment.TAG).commit()
        }
    }

    fun show(search: Search) {
        val projectFragment = MovieDetailFragment.forProject(search.imdbID!!)
        supportFragmentManager.beginTransaction().addToBackStack("project").replace(R.id.fragment_container, projectFragment, null).commit()
    }
}
