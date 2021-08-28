package com.example.stringreversal

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.useButton)

        button.setOnClickListener {
            val userInput = findViewById<EditText>(R.id.userInput).text.toString()
            val exclusion = findViewById<EditText>(R.id.restrictedChars).text.toString()
            val programOutput = findViewById<TextView>(R.id.programOutput)

            val wordsInString = userInput.split(" ")
            val wordsSize = wordsInString.size
            var wordPointer = 0

            while (wordPointer < wordsSize) {
                val currentWord = wordsInString[wordPointer]
                val charArray = currentWord.toCharArray()

                var charPointerOne = 0
                var charPointerTwo = currentWord.length - 1

                while (charPointerOne < charPointerTwo) {
                    if (exclusion.contains(charArray[charPointerOne])) {
                        charPointerOne++
                    } else if (exclusion.contains(charArray[charPointerTwo])) {
                        charPointerTwo--
                    } else {
                        val charToSwitchOne = charArray[charPointerOne]
                        val charToSwitchTwo = charArray[charPointerTwo]
                        charArray[charPointerOne] = charToSwitchTwo
                        charArray[charPointerTwo] = charToSwitchOne
                        charPointerOne++
                        charPointerTwo--
                    }
                }

                wordPointer++
                val outputString = String(charArray)
                programOutput.text = "$outputString ${programOutput.text}"
            }
        }
    }
}




