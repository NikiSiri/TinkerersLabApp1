package com.example.loginpage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Categories : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_categories)

        val actionBar = supportActionBar
        actionBar!!.title = "CATEGORIES"
        actionBar.setDisplayHomeAsUpEnabled(true)
    }
}