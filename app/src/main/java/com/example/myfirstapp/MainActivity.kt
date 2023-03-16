package com.example.myfirstapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.myfirstapp.Shape.Line
import com.example.myfirstapp.Shape as Shape1

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this, "Text", Toast.LENGTH_SHORT).show()
    }
}


