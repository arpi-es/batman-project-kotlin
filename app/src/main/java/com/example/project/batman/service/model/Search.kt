package com.example.project.batman.service.model

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


@Entity(tableName = "tblSearch")
class Search {

    @PrimaryKey(autoGenerate = false)
    @NonNull
    @ColumnInfo(name = "imdbID")
    @SerializedName("imdbID")
    @Expose
    var imdbID: String? = "-1"

    @SerializedName("Title")
    @Expose
    var title: String? = null
    @SerializedName("Year")
    @Expose
    var year: String? = null


    @SerializedName("Type")
    @Expose
    var type: String? = null
    @SerializedName("Poster")
    @Expose
    var poster: String? = null

}