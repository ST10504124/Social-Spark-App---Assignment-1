package com.example.assignment1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.sql.Time

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

// Declarations of variables

        val txtTime = findViewById<TextView>(R.id.txtTime)
        val txtAnswer = findViewById<EditText>(R.id.txtAnswer)
        val btnSubmit = findViewById<Button>(R.id.btnSubmit)
        val btnReset = findViewById<Button>(R.id.btnReset)
        val imageView = findViewById<ImageView>(R.id.imageView)

        // Button set up

        btnSubmit.setOnClickListener {
            // If, then, else statements to check for valid input

            val Time= txtAnswer.text.toString().trim().lowercase()
            if (Time.isEmpty()) {
                txtAnswer.setText("Please enter valid input")
            }

            else if (Time == "morning") {
                txtTime.text = "Send a Good Morning text to a family"
            }
            else if (Time == "mid morning") {
                txtTime.text = "Reach out to a colleague with a quick Thank you."
            }
            else if (Time == "afternoon") {
                txtTime.text = "Share a funny meme or interesting link with a friend."
            }
            else if (Time == "afternoon snack time") {
                txtTime.text = "Send a quick thinking of you message."
            }
            else if (Time == "dinner") {
                txtTime.text = "Call a friend or relative for a 5 minute catch-up."
            }
            else if (Time == "after dinner / night") {
                txtTime.text = "Leave a thoughtful comment on a friends post."
            }
            else {
                txtAnswer.setText("Please enter a valid input")
            }

            btnReset.setOnClickListener {
                txtAnswer.text.clear()
                txtTime.text = ""

            }
        }
    }
}