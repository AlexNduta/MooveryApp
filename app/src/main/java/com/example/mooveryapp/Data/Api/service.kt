package com.example.mooveryapp.Data
import com.example.mooveryapp.Data.Model.Artist.ArtistList
import com.example.mooveryapp.Data.Model.Movie.MovieList
import com.example.mooveryapp.Data.Model.TvShow.TvShowList
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface service {
//Create functions to fetch data from the API
    //my get popular movie function returns a Retrofit response of MovieList
    //We pass the query parameters
    @GET("movie/popular")
    suspend fun getPopularMovies(@Query("api_key")apikey:String):Response<MovieList>

    //Create a function to fetch the popular Tv Shows
    @GET("tv/popular")
    suspend fun getPopularTvShows(@Query("api_key")apikey:String):Response<TvShowList>

    @GET("person/popular")
    suspend fun getPopularArtists(@Query("api_key")apikey:String):Response<ArtistList>
}