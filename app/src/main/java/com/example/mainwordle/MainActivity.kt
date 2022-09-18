package com.example.mainwordle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var k = FourLetterWordList.getRandomFourLetterWord()
        var editText = findViewById<EditText>(R.id.userinput)
        var inputString = editText.text.toString()
        var count = 0

        var showguess1 = findViewById<TextView>(R.id.guess1);
        var showguess1answer = findViewById<TextView>(R.id.guess1string)
        /*
        val button = findViewById<Button>(R.id.FrontButton)
        button.setOnClickListener {
            Log.v("hello", "world")
            Toast.makeText(this, "Hi there too!", Toast.LENGTH_SHORT).show()
            button.setText(k)
        }
        */
    }


    private fun checkGuess(guess: String, wordToGuess : String) : String {
        var result = ""
        for (i in 0..3) {
            if (guess[i] == wordToGuess[i]) {
                result += "O"
            }
            else if (guess[i] in wordToGuess) {
                result += "+"
            }
            else {
                result += "X"
            }
        }
        return result
    }

}

