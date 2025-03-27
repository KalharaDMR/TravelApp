package com.example.travel

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class bookingsPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_bookings_page)

        val profileimgview: ImageView = findViewById(R.id.profBtn)
        val searchimgview: ImageView = findViewById(R.id.searchBtn)
        val bookingimgview: ImageView = findViewById(R.id.bookingBtn)
        val saveimgview: ImageView = findViewById(R.id.saveBtn)

        profileimgview.setOnClickListener {
            // Navigate to HotelsActivity
            val intent = Intent(this, logoutsettings::class.java)
            startActivity(intent)
        }

        searchimgview.setOnClickListener {
            // Navigate to HotelsActivity
            val intent = Intent(this, ThirdActivity::class.java)
            startActivity(intent)
        }

        bookingimgview.setOnClickListener {
            // Navigate to HotelsActivity
            val intent = Intent(this, bookingsPage::class.java)
            startActivity(intent)
        }

    }
}