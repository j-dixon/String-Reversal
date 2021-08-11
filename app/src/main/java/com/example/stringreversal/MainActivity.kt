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
            val count = typedArray.count()
            var nul: Int = 0

            while (nul <= count) for (word in typedArray)
                word.reversed()
                    nul++

            val reverseString = typedArray.toString()

            changeText.text = reverseString
        }
    }
}
