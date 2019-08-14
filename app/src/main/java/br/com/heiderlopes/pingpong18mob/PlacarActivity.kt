package br.com.heiderlopes.pingpong18mob

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_placar.*

class PlacarActivity : AppCompatActivity() {

    var scorePlayer1 = 0
    var scorePlayer2 = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_placar)

        if(savedInstanceState != null) {
            scorePlayer1 = savedInstanceState.getInt("SCORE_PLAYER_1", 0)
            scorePlayer2 = savedInstanceState.getInt("SCORE_PLAYER_2", 0)
            tvScorePlayer1.text = scorePlayer1.toString()
            tvScorePlayer2.text = scorePlayer2.toString()
        }

        setUpExtras()
        startGame()

        btAddScorePlayer1.setOnClickListener {
            scorePlayer1++
            tvScorePlayer1.text = scorePlayer1.toString()
        }

        btAddScorePlayer2.setOnClickListener {
            scorePlayer2++
            tvScorePlayer2.text = scorePlayer2.toString()
        }
    }

    private fun startGame() {
        tvScorePlayer1.text = scorePlayer1.toString()
        tvScorePlayer2.text = scorePlayer2.toString()
    }

    private fun setUpExtras() {
        tvNamePlayer1.text = intent.getStringExtra("PLAYER_1") ?: "Player 1"
        tvNamePlayer2.text = intent.getStringExtra("PLAYER_2") ?: "Player 2"
    }

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        outState?.putInt("SCORE_PLAYER_1", scorePlayer1)
        outState?.putInt("SCORE_PLAYER_2", scorePlayer2)

    }
}














