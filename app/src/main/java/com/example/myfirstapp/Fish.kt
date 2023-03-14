package com.example.myfirstapp

class Fish(nameFish:String):Animal(nameFish), Voice {
    init {
        fun nameFish() {
            println("Fish`s name is ${nameFish}")
        }
    }

    override fun lowVoice(name: String) {

    }

    override fun loudVoice(name: String) {

    }

}