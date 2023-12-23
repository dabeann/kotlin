package com.example.testapplication

open class Human (val name: String = "Anonymous") {

    constructor(name: String, age: Int) : this(name){ // 부생성자
        println("my name is ${name}, ${age}years old")
    }

    init { // 주생성자
        println("New human has been born!!")
    }

    fun eatingCake() {
        println("This is so YUMMMYYYYY~~~~")
    }

    open fun singASong(){
        println("lalala")
    }
}

class Korean : Human() {

    override fun singASong() {
        super.singASong()
        println("랄랄라")
        println("my name is ${name}")
    }
}


fun main() {
    val human = Human("minsu")

    val stranger = Human()

    human.eatingCake()

    val mom = Human("Kuri", 52)

    println("this human's name is ${human.name}")
    println("this human's name is ${stranger.name}")

    val korean = Korean()
    korean.singASong()
}