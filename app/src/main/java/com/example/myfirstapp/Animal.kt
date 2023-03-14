package com.example.myfirstapp

open class Animal(val name:String) {

    val v1 = 1;
    fun wFun (){
        var arrayOfAnimals = ArrayList<Animal>()
        arrayOfAnimals.add(Dog("Fred"))
        arrayOfAnimals.add(Dog("Jack"))
        arrayOfAnimals.add(Dog("Oggy"))

        println("Dog`s name")
        for (x in arrayOfAnimals) {
            println(x)
        }
    }

}