@file:Suppress("UNUSED_CHANGED_VALUE")

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

        val userString = findViewById<EditText>(R.id.userInput)
        val submitButton = findViewById<Button>(R.id.useButton)
        val changeText = findViewById<TextView>(R.id.programOutput)

        submitButton.setOnClickListener {
            val getString = userString.text

            val typedArray: Array<String> = getString.split(" ").toTypedArray()

            val reverseString = typedArray.toString()

            val programOutput = reverseString.split(" ").joinToString(" ") { it -> it.reversed() }

            changeText.text = programOutput
        }
    }
}
