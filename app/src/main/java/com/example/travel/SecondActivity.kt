package com.example.travel

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val profileimgview: ImageView = findViewById(R.id.profBtn)
        val searchimgview: ImageView = findViewById(R.id.searchBtn)
        val bookingimgview: ImageView = findViewById(R.id.bookingBtn)
        val saveimgview: ImageView = findViewById(R.id.saveBtn)

        profileimgview.setOnClickListener {
            // Navigate to HotelsActivity
            val intent = Intent(this, SettingsPage::class.java)
            startActivity(intent)
        }

        searchimgview.setOnClickListener {
            // Navigate to HotelsActivity
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }

        bookingimgview.setOnClickListener {
            // Navigate to HotelsActivity
            val intent = Intent(this, bookingsPage::class.java)
            startActivity(intent)
        }




    }
}