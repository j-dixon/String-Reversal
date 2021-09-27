package com.example.stringreversal

// program imports
import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private val reverse = ReverseString()

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // defines button and locates it in activity_main.xml
        val button = findViewById<Button>(R.id.useButton)

        // sets an OnClickListener to the button, runs code below when clicked / pressed
        button.setOnClickListener {
            // defines UI elements and locates them in activity_main.xml
            val userInput = findViewById<EditText>(R.id.userInput)
            val exclusion = findViewById<EditText>(R.id.restrictedChars)
            val programOutput = findViewById<TextView>(R.id.programOutput)

            val input: String = userInput.text.toString()
            val exclude: String = exclusion.text.toString()

            val output = reverse.reverse(input, exclude)

            programOutput.text = output
        }
    }
}







