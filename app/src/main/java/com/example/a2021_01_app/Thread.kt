package com.example.a2021_01_app

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_thread.*
import java.lang.Thread
import java.util.concurrent.ThreadLocalRandom

class Thread : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_thread)


        val runnable : Runnable = object : Runnable{
            override fun run() {
                Log.d("thread-1", "Thread1is made")
            }
        }
        val thread : Thread = Thread(runnable)
        button.setOnClickListener {

            thread.start()
        }
        Thread(object : Runnable{
            override fun run(){
                Log.d("thread-1", "Thread2 is made")

            }
        }).start()

        Thread(Runnable {
            Thread.sleep(2000)
            Log.d("thread-1", "Thread3 is made")
            runOnUiThread{
                 button.setBackgroundColor(getColor(R.color.textview_color))

            }
        }).start()
    }
}