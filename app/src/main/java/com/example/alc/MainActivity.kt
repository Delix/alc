package com.example.alc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity

import android.os.Bundle
import com.bumptech.glide.Glide


import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        Glide.with(this).load("https://media.giphy.com/media/8uQb3imdaLBPa/giphy.gif").into(imageView)
        Profile.setOnClickListener {
            Change("Profile")

        }
        About.setOnClickListener {
            Change("About")
        }

    }
    fun Change(name:String)
    {
        if(name == "Profile")
        {
            val intent =  Intent(this, com.example.alc.Profile::class.java)
            startActivity(intent)
        }
        else
        {
            val intent =  Intent(this, com.example.alc.About::class.java)
            startActivity(intent)
        }
    }
}
