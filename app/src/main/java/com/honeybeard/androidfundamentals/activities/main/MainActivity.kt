package com.honeybeard.androidfundamentals.activities.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.honeybeard.androidfundamentals.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}