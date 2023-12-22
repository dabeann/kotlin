package com.example.testapplication

fun main() {
    helloWorld()

    println(add(4, 5))
}

// 1. 함수

fun helloWorld(){
    println("Hello World!")
}

fun add(a: Int, b: Int) : Int { // : 뒤가 return type
    return a + b
}