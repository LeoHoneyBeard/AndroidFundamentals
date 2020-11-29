package com.honeybeard.androidfundamentals.activities.movie_list

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.honeybeard.androidfundamentals.R

class MoviesListFragment : Fragment() {
    private var selectMovieListener: SelectMovieListener? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_movies_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<View>(R.id.movie_preview).setOnClickListener{
            selectMovieListener?.selectMovie()
        }
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if(activity is SelectMovieListener) {
            selectMovieListener = activity as SelectMovieListener
        }
    }

    override fun onDetach() {
        selectMovieListener = null
        super.onDetach()
    }

    interface SelectMovieListener {
        fun selectMovie()
    }
}