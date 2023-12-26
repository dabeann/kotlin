package com.example.testapplication.grammar

fun main() {
    // type check is
    val dog: Animal = Dog()
    val cat = Cat()

    if (dog is Dog) {
        println("멍멍이")
    }

    // 강제 타입 변환 as
    // cat as Dog

    // generic
    val box = Box(10)
    val box2 = Box("asdf")
    println(box.value)

    // callback
    myFunc(10) {
        println("함수 호출")
    }
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

// generic
class Box<T>(var value: T)

// callback
fun myFunc(a: Int, callBack: () -> Unit= {}){
    println("함수 시작")
    callBack()
    println("함수 끝")
}
