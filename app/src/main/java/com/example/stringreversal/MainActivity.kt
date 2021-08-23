package com.example.stringreversal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.collections.contains as contains

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val userInput = findViewById<EditText>(R.id.userInput)
        val exclusion = findViewById<EditText>(R.id.restrictedChars)
        val programOutput = findViewById<TextView>(R.id.programOutput)
        val button = findViewById<Button>(R.id.useButton)

        button.setOnClickListener {
            val functionOutput = reverseString(userInput.toString(), exclusion.toString()).toString()

            programOutput.text = functionOutput
        }

    }

    private fun reverseString(userInput: String, exclusion: String) {
        // splits user inputted string by whitespace
        val restrictions = exclusion.split(",")
        val words = userInput.split(" ")

        // extracts each word in the list 'words'
        for (word in words) {
            // stores length of current word in the loop
            val length = word.length

            // stores each character of the current word in an array
            val charArray = word.toCharArray()

            // assigns two 'pointers', one assigned to 0 and the another to the final array segment
            var pointerOne = 0
            var pointerTwo = length - 1

            val characterOne = charArray[pointerOne]
            val characterTwo = charArray[pointerTwo]
            var currentCharacterOne = 'a'
            var currentCharacterTwo = 'a'

            // while the pointers are not equal to each other...
            // if either of the pointers are equal to an exclusion character...
            while (pointerOne != pointerTwo) {
                if (restrictions.contains<Any>(characterOne)) {
                    // upscale pointer to the next character
                    pointerOne++
                } else {
                    currentCharacterOne = characterOne
                }

                if (restrictions.contains<Any>(characterTwo)) {
                    // downscale pointer to the previous character
                    pointerTwo--
                } else {
                    currentCharacterTwo = characterTwo
                }

                charArray[pointerOne] = currentCharacterTwo
                charArray[pointerTwo] = currentCharacterOne
                pointerOne++
                pointerTwo--
            }
        }
    }
}




