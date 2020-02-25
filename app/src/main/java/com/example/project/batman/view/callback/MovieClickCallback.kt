package com.example.project.batman.view.callback

import com.example.project.batman.service.model.Search

interface MovieClickCallback {
    fun onClick(search: Search)
}
