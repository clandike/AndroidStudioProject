package com.example.myfirstapp

class Cat(nameCat:String):Animal(nameCat), Voice {
    init {
        fun name(){
            println("Cat`s name is ${nameCat}")
        }
    }

    override fun lowVoice(name: String) {

    }

    override fun loudVoice(name: String) {

    }

}