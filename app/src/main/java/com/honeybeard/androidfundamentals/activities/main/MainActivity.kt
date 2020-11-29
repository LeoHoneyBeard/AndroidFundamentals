package com.honeybeard.androidfundamentals.activities.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.honeybeard.androidfundamentals.R
import com.honeybeard.androidfundamentals.activities.movie_details.MovieDetailsFragment
import com.honeybeard.androidfundamentals.activities.movie_list.MoviesListFragment

class MainActivity : AppCompatActivity(), MoviesListFragment.SelectMovieListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun selectMovie() {
        supportFragmentManager.beginTransaction()
            .apply {
                add(R.id.root, MovieDetailsFragment())
                addToBackStack("movie_details")
                commit()
            }
    }
}