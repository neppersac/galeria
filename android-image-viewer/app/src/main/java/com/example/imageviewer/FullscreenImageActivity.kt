package com.example.imageviewer

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class FullscreenImageActivity : AppCompatActivity() {

    private lateinit var imageView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fullscreen_image)

        imageView = findViewById(R.id.fullscreen_image_view)

        // Get the image URI from the intent
        val imageUri: Uri? = intent.getParcelableExtra("imageUri")
        imageView.setImageURI(imageUri)
    }

    companion object {
        fun newIntent(context: MainActivity, imageUri: Uri): Intent {
            val intent = Intent(context, FullscreenImageActivity::class.java)
            intent.putExtra("imageUri", imageUri)
            return intent
        }
    }
}