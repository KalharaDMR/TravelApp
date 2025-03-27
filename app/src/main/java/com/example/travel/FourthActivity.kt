package com.example.travel

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class FourthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_fourth)


        val bookingButton = findViewById<ImageView>(R.id.imageButton)
        val anotherButton = findViewById<ImageView>(R.id.imageButton2)

        bookingButton.setOnClickListener {
            Log.d("BUTTON_TEST", "Booking button clicked")
            try {
                startActivity(Intent(this, hotelBook::class.java))
            } catch (e: Exception) {
                Toast.makeText(this, "Failed to open: ${e.message}", Toast.LENGTH_SHORT).show()
            }
        }
    }
}