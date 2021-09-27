package com.example.stringreversal

class ReverseString {
    fun reverse(input: String?, exclude: String?): String {
        // splits user inputted string by whitespace; gets size of the returned list; defines wordPointer as 0
        val wordsInString = input?.split(" ")
        val wordsSize = wordsInString?.size
        var wordPointer = 0
        val list = arrayListOf<String>()

        if (input != null && exclude != null) {
            // while wordPointer is less than wordsSize...
            while (wordPointer < wordsSize!!) {
                // defines the current word in the string by locating the index at [wordPointer]
                val currentWord = wordsInString[wordPointer]
                // defines a character array to store the current word, split into characters
                val charArray = currentWord.toCharArray()

                // defines two more pointers, one starting at index [0] and one starting at the last index
                var charPointerOne = 0
                var charPointerTwo = (currentWord.length).minus(1)

                // while charPointerOne is less than charPointerTwo
                while (charPointerOne < charPointerTwo) {
                    // if the currently selected character by charPointerOne is included in the exclusion characters...
                    when {
                        charArray[charPointerOne].let { exclude.contains(it) } -> {
                            // move charPointerOne one place forward
                            charPointerOne++
                            // else if the currently selected character by charPointerTwo is included in the exclusion characters...
                        }
                        charArray[charPointerTwo].let { exclude.contains(it) } -> {
                            // move charPointerTwo one place backwards
                            charPointerTwo--
                            // else, if both conditions are not true, do...
                        }
                        else -> {
                            // defines the two characters to switch by charPointerOne and charPointerTwo
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
                }

                val result = String(charArray)
                list.add(result)
                // increase the wordPointer by one so the program moves onto the next word in the string
                wordPointer++
                // assigns each character array to a variable, converted into a string
            }

        }

        var newString = ""
        // concatenates new string with the reversed output
        for (i in list) {
            newString = newString.plus("$i ")
        }

        // returns output as the newly reversed string
        return newString
    }
}