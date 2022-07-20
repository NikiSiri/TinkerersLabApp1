package com.example.loginpage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class USERPROFILE : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_userprofile)

        val actionBar = supportActionBar
        actionBar!!.title = "USER PROFILE"
        actionBar.setDisplayHomeAsUpEnabled(true)
        button.setOnClickListener{
            val intent = Intent(this, Categories::class.java)
            startActivity(intent)
        }
        }

    }
