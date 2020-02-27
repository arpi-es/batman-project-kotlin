package com.example.project.batman.view.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.project.batman.R
import com.example.project.batman.databinding.ProjectListItemBinding
import com.example.project.batman.service.model.Search
import com.example.project.batman.view.callback.MovieClickCallback

class MovieAdapter(private val projectClickCallback: MovieClickCallback?) : RecyclerView.Adapter<MovieAdapter.movieViewHolder>() {

    internal var searchMovieList: List<Search>? = null


    fun setMovieList(list: List<Search>) {
        if (this.searchMovieList == null) { this.searchMovieList = list
            notifyItemRangeInserted(0, list.size)
        } else {
            val result = DiffUtil.calculateDiff(object : DiffUtil.Callback() {
                override fun getOldListSize(): Int {
                    return this@MovieAdapter.searchMovieList!!.size
                }

                override fun getNewListSize(): Int {
                    return list.size
                }

                override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
                    return this@MovieAdapter.searchMovieList!![oldItemPosition].imdbID == list[newItemPosition].imdbID
                }

                override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
                    val project = list[newItemPosition]
                    val old = list[oldItemPosition]
                    return project.imdbID == old.imdbID && project.title == old.title
                }
            })
            this.searchMovieList = list
            result.dispatchUpdatesTo(this)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): movieViewHolder {
       val binding = DataBindingUtil.inflate<ProjectListItemBinding>(LayoutInflater.from(parent.context), R.layout.movie_list_item, parent, false)
        binding.callback = projectClickCallback

        return movieViewHolder(binding)
    }

    override fun onBindViewHolder(holder: movieViewHolder, position: Int) {
        holder.binding.search = searchMovieList!![position]
        holder.binding.executePendingBindings()


    }



    override fun getItemCount(): Int {
        return if (searchMovieList == null) 0 else searchMovieList!!.size
    }


     class movieViewHolder(val binding: ProjectListItemBinding) : RecyclerView.ViewHolder(binding.root){

    }
}
