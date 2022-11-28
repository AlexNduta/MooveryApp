package com.example.mooveryapp.Data.DB

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.mooveryapp.Data.Model.Artist.Artist
import com.example.mooveryapp.Data.Model.Artist.ArtistList

//Our Artist dao carry out all the data related transactions
@Dao
interface ArtisrtDao {
    //the function saves listsd of artists to the database
    @Insert(onConflict = OnConflictStrategy.REPLACE)// wen saving the data, we replece previously existing data
    suspend fun savePopularArtists(Artists:List<Artist>)
    //The function deletes data from our database
    @Query("DELETE FROM popular_artists")
    suspend fun deleteArtist()
    //The function gets all the artists
 @Query("SELECT*FROM popular_artists")
    suspend fun getArtists()
}