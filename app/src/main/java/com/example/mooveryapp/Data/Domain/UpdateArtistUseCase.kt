package com.example.mooveryapp.Data.Domain

import com.example.mooveryapp.Data.Model.Artist.Artist

class UpdateArtistUseCase(private  val artistrepository:ArtistRepository) {

    suspend fun execute():List<Artist>? = artistrepository.UpdateArtist()
}