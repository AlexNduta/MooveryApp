package com.example.mooveryapp.Data.Domain

import com.example.mooveryapp.Data.Model.TvShow.TvShow

interface TvShowRepository {
    suspend fun getTvShow():List<TvShow>?
    suspend fun UpdateTvShow():List<TvShow>?
}