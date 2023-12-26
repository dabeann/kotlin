package com.example.testapplication.grammar

fun main() {

}

// 상속

open class Person2 // open 해야 상속 가능
class SuperMan: Person2()

abstract class Animal {
    open fun move() {
        println("이동")
    }
}

class Dog : Animal(), Drawable {
    override fun move() {
        println("껑충")
    }

    override fun draw() {
        TODO("Not yet implemented")
    }
}

class Cat : Animal() {
    override fun move() {
        println("살금")
    }
}

// interface
interface Drawable {
    fun draw()
}