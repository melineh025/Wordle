package com.example.mainwordle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var answer = FourLetterWordList.getRandomFourLetterWord() //four letter answer
        //var editText = findViewById<EditText>(R.id.userinput) // user input string
       // var inputString = editText.text.toString() //
        var count = 0
        var correct = 0

        var showguess1 = findViewById<TextView>(R.id.guess1);
        var showguess2 = findViewById<TextView>(R.id.guess2);
        var showguess3 = findViewById<TextView>(R.id.guess3);

        var showanswer = findViewById<TextView>(R.id.answer)
        showanswer.setText(answer)
        showanswer.visibility = View.VISIBLE
        var showguess1answer = findViewById<TextView>(R.id.guess1string)
        var showguess2answer = findViewById<TextView>(R.id.guess2string) //Guess#2 userinput
        var showguess3answer = findViewById<TextView>(R.id.guess3string) //Guess#3 userinput
       // var guess1X = checkGuess(inputString, answer)
       // var guess2X = checkGuess(inputString, answer)
       // var guess3X = checkGuess(inputString, answer)


        var checkg1 = findViewById<TextView>(R.id.guess1check)
        var checkg2 =  findViewById<TextView>(R.id.guess2check)
        var checkg3 =  findViewById<TextView>(R.id.guess3check)

        var showg1 = findViewById<TextView>(R.id.guess1print)
        var showg2 = findViewById<TextView>(R.id.guess2print)
        var showg3 = findViewById<TextView>(R.id.guess3print)

        val button = findViewById<Button>(R.id.button2)
        button.setOnClickListener {
            var editText = findViewById<EditText>(R.id.userinput) // user input string
            var inputString = editText.text.toString() //
            count++
            if(count == 1) {
                var guess1X = checkGuess(inputString, answer)
                showguess1.visibility = View.VISIBLE //Guess #1
                showguess1answer.setText(inputString) // Guess #1 string
                showguess1answer.visibility = View.VISIBLE

                checkg1.visibility = View.VISIBLE
                showg1.setText(guess1X)
                showg1.visibility = View.VISIBLE;
            }
            else if(count == 2) {
                var guess2X = checkGuess(inputString, answer)
                showguess2.visibility = View.VISIBLE
                showguess2answer.setText(inputString)
                showguess2answer.visibility = View.VISIBLE

                checkg2.visibility = View.VISIBLE
                showg2.setText(guess2X)
                showg2.visibility = View.VISIBLE
            }
            else if(count == 3) {
                var guess3X = checkGuess(inputString, answer)
                showguess3.visibility = View.VISIBLE
                showguess3answer.setText(inputString)
                showguess3answer.visibility = View.VISIBLE

                checkg3.visibility = View.VISIBLE
                showg3.setText(guess3X)
                showg3.visibility = View.VISIBLE

            }
        }


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

