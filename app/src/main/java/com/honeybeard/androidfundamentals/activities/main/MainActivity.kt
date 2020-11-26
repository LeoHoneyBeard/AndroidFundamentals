package com.honeybeard.androidfundamentals.activities.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.honeybeard.androidfundamentals.R
import com.honeybeard.androidfundamentals.activities.movie_details.MovieDetailsFragment
import com.honeybeard.androidfundamentals.activities.movie_list.MoviewListFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .apply {
                    add(R.id.fragment_root, MoviewListFragment())
                    commit()
                }
        }
    }

    fun selectMovie() {
        supportFragmentManager.beginTransaction()
            .apply {
                add(R.id.fragment_root, MovieDetailsFragment.newInstance())
                commit()
            }
    }

    override fun onBackPressed() {
        val last = supportFragmentManager.fragments.last()
        supportFragmentManager.beginTransaction()
            .apply {
                if (last is MoviewListFragment) {
                    super.onBackPressed()
                } else {
                    remove(last)
                    commit()
                }
            }
    }
}