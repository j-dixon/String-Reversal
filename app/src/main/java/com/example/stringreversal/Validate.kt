package com.example.stringreversal

object Validate {
    fun validateUserInput(userInput: String, exclusion: String): Boolean {
        return !(userInput.isEmpty() || exclusion.isEmpty())
    }
}