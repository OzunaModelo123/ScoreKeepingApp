package com.example.scorekeeping

import androidx.appcompat.app.AppCompatActivity


import android.os.Bundle
import com.example.scorekeeping.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var team1Score = 0
    private var team2Score = 0
    private var scoreChange = 1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.team1IncreaseButton.setOnClickListener {
            team1Score += scoreChange
            binding.team1ScoreTextView.text = team1Score.toString()
        }

        binding.team1DecreaseButton.setOnClickListener {
            team1Score -= scoreChange
            binding.team1ScoreTextView.text = team1Score.toString()
        }
    }
}