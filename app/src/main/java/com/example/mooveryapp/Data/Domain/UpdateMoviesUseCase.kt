package com.example.mooveryapp.Data.Domain

import com.example.mooveryapp.Data.Model.Movie.Movie

class UpdateMoviesUseCase(private val movierepository:movieRepository) {

    suspend fun execute():List<Movie>? = movierepository.UpdateMovies()
}