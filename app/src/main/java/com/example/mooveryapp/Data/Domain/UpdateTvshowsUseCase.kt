package com.example.mooveryapp.Data.Domain

import com.example.mooveryapp.Data.Model.TvShow.TvShow

class UpdateTvshowsUseCase(private val tvshowrepository:TvShowRepository) {
    suspend fun execute():List<TvShow>? = tvshowrepository.UpdateTvShow()

}
