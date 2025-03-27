package com.example.travel

import android.os.Bundle
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


    }
}