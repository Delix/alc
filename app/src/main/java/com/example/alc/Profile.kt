package com.example.alc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.activity_profile.*

class Profile : AppCompatActivity()
{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        detail.text ="Track: Android"
        detail1.text ="Country: South Africa"
        detail2.text ="Email: s212317165@gmail.com"
        detail3.text ="Phone number: 0710938924"
        detail4.text = "Slack username:@Dumisanitom"



        Glide.with(this).load("https://firebasestorage.googleapis.com/v0/b/invitation-7c83a.appspot.com/o/d.t.jpg?alt=media&token=4244e01c-4187-4eeb-b0c2-56ab63bc3c7d") .apply(RequestOptions.circleCropTransform()).into(mypic)

    }


}
