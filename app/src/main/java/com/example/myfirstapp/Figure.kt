package com.example.myfirstapp

data class Figure(var width: Int, var height: Int) {

    var area: Int = this.width * this.height
        private set
}
