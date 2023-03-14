package com.example.myfirstapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cat = Cat("Freddy")
        cat.name

        val animal = Animal("Fred")
        animal.name
        animal.v1
        animal.wFun()
    }
}