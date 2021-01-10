package com.example.a2021_01_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_intent.*

class Intent1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent)


        change_activity.setOnClickListener{
            val intent= Intent(this@Intent1, Intent2::class.java)
            startActivity(intent)
        }



    }
}