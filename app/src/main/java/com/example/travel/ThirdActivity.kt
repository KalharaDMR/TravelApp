package com.example.travel

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_third)

        val textViewGreeting: TextView = findViewById(R.id.a3text1)
        val name = intent.getStringExtra("USER_NAME")

        if (name != null) {
            textViewGreeting.text = "Hello, $name!"
        }else{
            textViewGreeting.text="Guest!"
        }

        val action = intent.action

        if(action == "com.example.MY_CUSTIOM_ACTION"){
            textViewGreeting.text = "Activity opened via Custom Intent!"
        }

        val bookHotel: ImageView = findViewById(R.id.imageView11)

        bookHotel.setOnClickListener {
            // Navigate to HotelsActivity
            val intent = Intent(this,FourthActivity::class.java)
            startActivity(intent)
        }

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