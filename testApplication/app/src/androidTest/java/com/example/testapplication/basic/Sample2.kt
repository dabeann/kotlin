package com.example.testapplication.basic



// 1. Lamda
// 람다식은 우리가 마치 value 처럼 다룰 수 있는 익명함수이다.
// 1) 메소드의 파라미터로 넘겨줄 수가 있다. fun maxBy(a: Int)
// 2) return 값으로 사용할 수가 있다.

// 람다의 기본 정의
// val lamdaName: Type = {argumentList -> codeBody}

val square: (Int) -> (Int) = {number -> number * number}
// val square = {number: Int -> number * number}
// 한 곳에는 Type 선언해야 추론가능

val nameAge = {name: String, age: Int ->
    "my name is ${name} I'm ${age}"
}

fun main() {
    println(square(12))
    println(nameAge("dabin", 22))

    val a = "dabin said"
    val b = "mac said"

    println(a.pizzaIsGreat())
    println(b.pizzaIsGreat())

    println(extendString("ariana", 27))

    println(calculateGrade(97))
    println(calculateGrade(971))


    val lamda = {number: Double ->
        number == 4.3213
    }

    println(invokeLamda(lamda))
    println(invokeLamda({it > 3.22}))

    println(invokeLamda { it > 3.22 }) // 마지막 파라미터가 lamda식일 때
}

// 1-2. 확장함수

val pizzaIsGreat: String.() -> String = {
    this + "Pizza is the best!"
}

fun extendString(name: String, age:Int): String{
    val introduceMyself: String.(Int) -> String ={"I am ${this} and ${it} years old"}
    return name.introduceMyself(age)
}

// 1-3. Lamda의 Return

val calculateGrade: (Int) -> String = {
    when (it) {
        in 0..40 -> "fail"
        in 41..70 -> "pass"
        in 71..100 -> "perfect"
        else -> "Error"
    }
}

// 1-4. Lamda를 표현하는 여러가지 방식

fun invokeLamda(lamda: (Double) -> Boolean) : Boolean {
    return lamda(5.2343)
} // Boolean을 return