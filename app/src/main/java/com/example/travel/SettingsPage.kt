package com.example.travel

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SettingsPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_settings_page)

        val signinbtn: Button = findViewById(R.id.signInBtn)
        signinbtn.setOnClickListener {
            val intent = Intent(this, SignInPage::class.java)
            startActivity(intent)
        }
    }
}