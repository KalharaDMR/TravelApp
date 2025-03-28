package com.example.travel

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity



class SignInPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in_page)

        val editTextName: EditText = findViewById(R.id.editTextText)
        val signinbtn2: Button = findViewById(R.id.sign)
        val editTextPassword: EditText = findViewById(R.id.editTextTextPassword)


            signinbtn2.setOnClickListener {
                val name = editTextName.text.toString()
                val password = editTextPassword.text.toString()

                if (isPasswordValid(password)) {
                    val intent = Intent(this, ThirdActivity::class.java)
                    intent.putExtra("USER_NAME", name)
                    startActivity(intent)
                }else {
                    Toast.makeText(
                        this,
                        "Password must be at least 8 characters long",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }



    }
    private fun isPasswordValid(password: String): Boolean {
        return password.length >= 8
    }
}