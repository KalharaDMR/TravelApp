package com.example.travel

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class hotelBookingform : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_hotel_bookingform)


        val hotelBookBtn: Button = findViewById(R.id.Book)
        hotelBookBtn.setOnClickListener {
            val intent = Intent(this, bookingsPage::class.java)
            startActivity(intent)
        }
    }
}