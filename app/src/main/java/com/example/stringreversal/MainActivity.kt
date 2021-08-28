package com.example.stringreversal

// program imports
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

        // defines button and locates it in activity_main.xml
        val button = findViewById<Button>(R.id.useButton)

        // sets an OnClickListener to the button, runs code below when clicked / pressed
        button.setOnClickListener {
            // defines UI elements and locates them in activity_main.xml
            val userInput = findViewById<EditText>(R.id.userInput).text.toString()
            val exclusion = findViewById<EditText>(R.id.restrictedChars).text.toString()
            val programOutput = findViewById<TextView>(R.id.programOutput)

            // splits user inputted string by whitespace; gets size of the returned list; defines wordPointer as 0
            val wordsInString = userInput.split(" ")
            val wordsSize = wordsInString.size
            var wordPointer = 0

            // while wordPointer is less than wordsSize...
            while (wordPointer < wordsSize) {
                // defines the current word in the string by locating the index at [wordPointer]
                val currentWord = wordsInString[wordPointer]
                // defines a character array to store the current word, split into characters
                val charArray = currentWord.toCharArray()

                // defines two more pointers, one starting at index [0] and one starting at the last index
                var charPointerOne = 0
                var charPointerTwo = currentWord.length - 1

                // while charPointerOne is less than charPointerTwo
                while (charPointerOne < charPointerTwo) {
                    // if the currently selected character by charPointerOne is included in the exclusion characters...
                    if (exclusion.contains(charArray[charPointerOne])) {
                        // move charPointerOne one place forward
                        charPointerOne++
                        // else if the currently selected character by charPointerTwo is included in the exclusion characters...
                    } else if (exclusion.contains(charArray[charPointerTwo])) {
                        // move charPointerTwo one place backwards
                        charPointerTwo--
                        // else, if both conditions are not true, do...
                    } else {
                        // defines the two characters to swtich by charPointerOne and charPointerTwo
                        val charToSwitchOne = charArray[charPointerOne]
                        val charToSwitchTwo = charArray[charPointerTwo]
                        // swaps these characters with each other
                        charArray[charPointerOne] = charToSwitchTwo
                        charArray[charPointerTwo] = charToSwitchOne
                        // moves charPointerOne and charPointerTwo one place forward and one place backwards respectively
                        charPointerOne++
                        charPointerTwo--
                    }
                }
                // increase the wordPointer by one so the program moves onto the next word in the string
                wordPointer++
                // assigns each character array to a variable, converted into a string
                val outputString = String(charArray)
                // sets the programOutput text as the output from the loops
                programOutput.text = "$outputString ${programOutput.text}"
            }
        }
    }
}




