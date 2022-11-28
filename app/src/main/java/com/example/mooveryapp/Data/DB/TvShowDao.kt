package com.example.mooveryapp.Data.DB

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.mooveryapp.Data.Model.TvShow.TvShow
import com.example.mooveryapp.Data.Model.TvShow.TvShowList

//Our TV show Dao will carry out all our data operations
@Dao
interface tvShowDao
{
    //We create all the functions required to carry out our data operations
    @Insert (onConflict = OnConflictStrategy.REPLACE) //incase we need to update data, we will clear all the existing data
    suspend fun saveTSHow(Tvshows:List<TvShow>)

    //the function deletes tvshows
    @Query("DELETE FROM popular_tvshows")
    suspend fun dteleteTvShows()

    //the function gets all the data from the database
    @Query("SELECT * FROM popular_tvshows")
    suspend fun getMovies()
}