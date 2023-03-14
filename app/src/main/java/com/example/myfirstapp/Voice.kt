package com.example.myfirstapp

interface Voice {

    fun loudVoice(name:String) {
        println("${name} make your voice louder!")
    }
    fun lowVoice(name:String) {
        println("${name} make your voice lower!")
    }
}
