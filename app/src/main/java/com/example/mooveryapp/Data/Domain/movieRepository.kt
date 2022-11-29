package com.example.mooveryapp.Data.Domain

import com.example.mooveryapp.Data.Model.Movie.Movie

interface movieRepository {
    suspend fun getMovies():List<Movie>?
    suspend fun UpdateMovies():List<Movie>?
}