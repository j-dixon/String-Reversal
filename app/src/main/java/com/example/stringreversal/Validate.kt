package com.example.stringreversal

object Validate {
    fun validateUserInput(userInput: String, exclusion: String): Boolean {
        return !(userInput.isEmpty() || exclusion.isEmpty())
    }

    fun checkWordSize(wordSize: Int): Boolean {
        return wordSize < 0
    }
}