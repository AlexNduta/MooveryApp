package com.example.mooveryapp.Data.Model.Movie
import com.example.mooveryapp.Data.Model.Movie.Movie
import com.google.gson.annotations.SerializedName

data class MovieList(
    @SerializedName("results")
    val results: List<Movie>,
)