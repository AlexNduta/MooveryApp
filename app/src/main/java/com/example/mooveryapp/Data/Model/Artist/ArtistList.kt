package com.example.mooveryapp.Data.Model.Artist


import com.example.mooveryapp.Data.Model.Artist.Artist
import com.google.gson.annotations.SerializedName

data class ArtistList(
    @SerializedName("results")
    val results: List<Artist>)