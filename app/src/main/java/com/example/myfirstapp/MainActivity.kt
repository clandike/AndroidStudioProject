package com.example.myfirstapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.myfirstapp.Shape.Line
import com.example.myfirstapp.Shape as Shape1

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


        val square = Figure(1, 2)
        square.area

        val list = arrayListOf<Figure>(Figure(1, 2), Figure(2, 3))

        var sumAreas: Int = 0;
        list.forEach {
            sumAreas += it.area
        }
        print("Sum all area`s = $sumAreas")

        val list2 = listOf<com.example.myfirstapp.Shape>()
        for (x in list2) {
            when (list2[x]) {
                is com.example.myfirstapp.Shape.Line -> TODO()
                is com.example.myfirstapp.Shape.Oval -> TODO()
                is com.example.myfirstapp.Shape.Rectangle -> TODO()
            }
        }
    }
}


