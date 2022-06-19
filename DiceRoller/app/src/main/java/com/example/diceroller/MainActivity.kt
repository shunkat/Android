package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)
        val countButton: Button = findViewById(R.id.count_button)
        rollButton.setOnClickListener {
            rollDice()
        }
        countButton.setOnClickListener{
            countUp()
        }
    }

    private fun rollDice() {
        val resultText: TextView = findViewById(R.id.result_text)
        val randomInt = (1..6).random()
        resultText.text = randomInt.toString()
    }

    private fun countUp() {
        val resultText: TextView = findViewById(R.id.result_text)
        when (val number = resultText.text.toString().toIntOrNull()) {
            null -> {
                resultText.text = "文字じゃん"
            }
            6 -> {
                resultText.text = "マックスじゃん"
            }
            else -> {
                resultText.text = (number + 1).toString()
            }
        }
    }
}
