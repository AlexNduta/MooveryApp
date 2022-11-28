package com.example.mooveryapp.Data.Model.TvShow


import com.example.mooveryapp.Data.Model.TvShow.TvShow
import com.google.gson.annotations.SerializedName

data class TvShowList(
    @SerializedName("results")
    val results: List<TvShow>
)