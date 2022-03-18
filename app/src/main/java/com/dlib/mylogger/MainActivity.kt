package com.dlib.mylogger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dlib.dlogger.DLogger
import com.dlib.dlogger.L

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //It could be any string as per requirement and it is optional as well
        DLogger.setTag("MainActivity")

        //Example use case
        L.i(text = "Test MainActivity logging")
    }
}