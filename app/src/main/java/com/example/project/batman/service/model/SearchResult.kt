package com.example.project.batman.service.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class SearchResult {
    @SerializedName("Search")
    @Expose
    var search: List<Search>? = null
    @SerializedName("totalResults")
    @Expose
    var totalResults: String? = null
    @SerializedName("Response")
    @Expose
    var response: String? = null

}