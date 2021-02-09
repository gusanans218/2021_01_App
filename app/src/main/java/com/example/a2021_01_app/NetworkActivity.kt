package com.example.a2021_01_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.URL

class NetworkActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_network)

        val urlString: String = "http://mellowcode.org/json/students/"
        val url: URL = URL(urlString)
        val connection: HttpURLConnection = url.openConnection() as HttpURLConnection

        connection.requestMethod = "GET"
        connection.setRequestProperty("Content-Type", "application/json")

        var buffer =""
        if(connection.responseCode== HttpURLConnection.HTTP_OK){
            Log.d("connn","inputstream :"+connection.inputStream)
            val reader = BufferedReader(
                    InputStreamReader(
                            connection.inputStream,
                            "UTF-8"
                    )
            )
            buffer = reader.readLine()
        }
    }
}