package com.example.travel

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class hotelBook : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hotel_book)

        val hptel1Btn: Button = findViewById(R.id.hotel1btn)
        hptel1Btn.setOnClickListener {
            val intent = Intent(this, hotelBookingform::class.java)
            startActivity(intent)
        }


    }
}