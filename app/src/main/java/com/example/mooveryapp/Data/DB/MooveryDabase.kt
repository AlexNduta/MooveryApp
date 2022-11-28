package com.example.mooveryapp.Data.DB

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.mooveryapp.Data.Model.Artist.Artist
import com.example.mooveryapp.Data.Model.Movie.Movie
import com.example.mooveryapp.Data.Model.TvShow.TvShow

@Database(entities = [Movie::class, TvShow::class, Artist::class], version = 1, exportSchema = false)
abstract class MooveryDabase:RoomDatabase() {
    //We describe abstract functions to get the dao interfaces

    abstract fun movieDAo(): MovieDao
    abstract fun tvDao(): tvShowDao
    abstract fun artistDao(): ArtisrtDao

}