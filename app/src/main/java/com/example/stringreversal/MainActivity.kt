package com.example.stringreversal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val userInput = findViewById<EditText>(R.id.userInput).toString()
        val exclusion = findViewById<EditText>(R.id.restrictedChars).toString()
        val programOutput = findViewById<TextView>(R.id.programOutput)
        val button = findViewById<Button>(R.id.useButton)

        val wordsInString = userInput.split(" ")
        val wordsSize = wordsInString.size
        var wordPointer = 0

        while (wordPointer != wordsSize) {
            val currentWord = wordsInString[wordPointer]
            val charArray = currentWord.toCharArray()

            var charPointerOne = 0
            var charPointerTwo = currentWord.length - 1

            while (charPointerOne != charPointerTwo) {
                if (exclusion.contains(charArray[charPointerOne])) {
                    charPointerTwo++
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

            button.setOnClickListener {
                programOutput.text = outputString
            }
        }
    }
}




