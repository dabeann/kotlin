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

// 2. val vs var
// val = value 변하지 않는 값
// var = variable 변할 수 있는 값

fun hi() {
    val a : Int = 10
    var b : Int = 9

    var e : String // 그냥 선언만 할 때에는 String 이런 type 선언을 해 주어야 함

    b = 100

    val c = 100 // Int 적지 않아도 알아서 할당해줌
    var d = 100 // Int 적지 않아도 알아서 할당해줌

    var name = "dabin" // String 적지 않아도 알아서 할당해줌
}