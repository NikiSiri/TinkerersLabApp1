package com.example.loginpage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        /*  button.setOnClickListener {
            if (editTextTextEmailAddress.text.isNullOrBlank() && editTextTextPassword.text.isNullOrBlank()) {
                Toast.makeText(this, "Please fill the required fields", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(
                    this,
                    "${editTextTextEmailAddress.text} is logged in!!",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }*/

        button.setOnClickListener {
            if (editTextTextEmailAddress.text.isNullOrBlank() && editTextTextPassword.text.isNullOrBlank()) {
                Toast.makeText(this, "Please fill the required fields", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(
                    this,
                    "${editTextTextEmailAddress.text} is logged in!!",
                    Toast.LENGTH_SHORT
                ).show()
                val intent = Intent(this, USERPROFILE::class.java)
                startActivity(intent)

            }
        }
    }
}
