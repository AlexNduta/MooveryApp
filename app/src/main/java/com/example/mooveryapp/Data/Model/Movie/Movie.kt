package com.example.mooveryapp.Data.Model.Movie
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
@Entity(tableName = "Popular_movies")
data class Movie(
    @PrimaryKey
    @SerializedName("id")
    val id: Int?,
    @SerializedName("overview")
    val overview: String?,
    @SerializedName("popularity")
    val posterPath: String?,
    @SerializedName("release_date")
    val releaseDate: String?,
    @SerializedName("title")
    val title: String?,

)