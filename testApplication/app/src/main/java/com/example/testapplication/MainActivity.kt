package com.example.testapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.button)
        button.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                // to do..
            }
        })

        // 1. Kotlin interface가 아닌 Java interface여야 한다.
        // 2. 그 interface는 딱 하나의 method만 가져야 한다.

        button.setOnClickListener {
            // to do ..
        }

    }
}