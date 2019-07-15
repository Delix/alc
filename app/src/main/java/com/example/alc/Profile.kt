package com.example.alc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.activity_profile.*

class Profile : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)


        Glide.with(this).load("https://firebasestorage.googleapis.com/v0/b/invitation-7c83a.appspot.com/o/d.t.jpg?alt=media&token=4244e01c-4187-4eeb-b0c2-56ab63bc3c7d") .apply(RequestOptions.circleCropTransform()).into(mypic)

    }
}
