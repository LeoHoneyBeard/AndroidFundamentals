package com.honeybeard.androidfundamentals.activities.movie_details

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.honeybeard.androidfundamentals.R

class MovieDetailsFragment : Fragment(R.layout.fragment_movie_details) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<View>(R.id.back).apply {
            setOnClickListener { activity?.onBackPressed() }
        }
    }

}