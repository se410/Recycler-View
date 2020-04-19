package com.example.recyclerviewexample

import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_gallery.*

class GalleryActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gallery)

        getIncomingIntent()
    }

    private fun getIncomingIntent() {
        if (intent.hasExtra("image_url") && intent.hasExtra("image_name")) {
            val imageUrl = intent.getStringExtra("image_url")
            val imageName = intent.getStringExtra("image_name")
            setImage(imageUrl, imageName)
        }
    }


    private fun setImage(imageUrl: String, imageName: String) {
        val name: TextView = image_description
        name.text = imageName
        val image: ImageView = image
        Glide.with(this)
            .asBitmap()
            .load(imageUrl)
            .into(image)
    }

}