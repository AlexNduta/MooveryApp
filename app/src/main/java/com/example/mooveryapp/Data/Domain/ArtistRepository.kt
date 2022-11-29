package com.example.mooveryapp.Data.Domain

import com.example.mooveryapp.Data.Model.Artist.Artist

interface ArtistRepository {
    suspend fun getArtist():List<Artist>?
    suspend fun UpdateArtist():List<Artist>?
}