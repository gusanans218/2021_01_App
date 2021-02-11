package com.example.a2021_01_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.bumptech.glide.Glide.with as with1

class LibraryActivity : AppCompatActivity() {
   override fun onCreate(savedInstanceState: Bundle?) {
       super.onCreate(savedInstanceState)
       setContentView(R.layout.activity_library)

       Glide.with(this@LibraryActivity)
           .load("https://www.google.com/search?q=%EC%82%AC%EC%A7%84&tbm=isch&source=iu&ictx=1&fir=GZpW7ECvG3gVoM%252CrclhrRS630sGlM%252C_&vet=1&usg=AI4_-kQJrJk_Yanc-c4E6GXnSPDrdVlNYg&sa=X&ved=2ahUKEwjQq6KuraPuAhX1KKYKHScZAoYQ9QF6BAgIEAE#imgrc=GZpW7ECvG3gVoM")
           .centerCrop()
           .into(glide)
   }
}
