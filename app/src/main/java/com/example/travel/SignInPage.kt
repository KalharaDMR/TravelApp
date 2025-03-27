package com.example.travel

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity



class SignInPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in_page)

        val editTextName: EditText = findViewById(R.id.editTextText)
        val signinbtn2: Button = findViewById(R.id.sign)

        signinbtn2.setOnClickListener {
            val name = editTextName.text.toString()
            val intent = Intent(this, ThirdActivity::class.java)
            intent.putExtra("USER_NAME", name)
            startActivity(intent)
        }
    }
}