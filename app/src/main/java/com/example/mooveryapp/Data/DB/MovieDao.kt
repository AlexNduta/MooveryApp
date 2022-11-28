package com.example.mooveryapp.Data.DB

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.mooveryapp.Data.Model.Artist.Artist
import com.example.mooveryapp.Data.Model.Movie.Movie
import com.example.mooveryapp.Data.Model.Movie.MovieList
//Our Movie Dao will be used to carry out data transactions
@Dao
interface MovieDao {
    //We first create a function to save all our movies to the database
@Insert(onConflict = OnConflictStrategy.REPLACE) //when saving, Room will clear all the pre-existing data on out database
    suspend fun saveMovies(movies:List<Movie>) //We are supposed to save all our list of movies
   //We need to create a function to delete data and thus run a query to delete data in our
    @Query("DELETE FROM popular_movies")
    suspend fun deleteMovies()
    //We create a function to get all the movies we need from our database and display it on our recyclerview
    @Query("SELECT * FROM popular_movies")
    suspend fun getMovies()
}