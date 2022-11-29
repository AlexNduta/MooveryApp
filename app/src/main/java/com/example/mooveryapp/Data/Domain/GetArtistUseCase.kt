package com.example.mooveryapp.Data.Domain

import com.example.mooveryapp.Data.Model.Artist.Artist

class GetArtistUseCase(private val artistrepositotry:ArtistRepository) {

    suspend fun execute():List<Artist>? =artistrepositotry.getArtist()
}