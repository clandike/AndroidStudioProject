package com.example.myfirstapp

sealed class Shape() {
    class Rectangle() : Shape() {}
    class Oval() : Shape() {}
    class Line() : Shape() {}
}
