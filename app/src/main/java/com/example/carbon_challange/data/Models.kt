package com.example.carbon_challange.data

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 *@Created by Yerimah on 9/23/2021.
 */

@Entity(tableName = "movies")
data class Movie(
    @PrimaryKey var id: Int,
    var original_language: String,
    var overview: String,
    var poster_path: String,
    var title: String,
    var vote_average: Double,
    var release_date: String
)

data class MovieResponse(
    var results: List<Movie>
)