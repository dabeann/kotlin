package com.example.testapplication

fun main() {
    /*helloWorld()

    println(add(4, 5))*/

    // 3. String Template

    val name = "dabin"
    val lastName = "Choi"
    println("my name is $name")
    println("my name is ${name + lastName}, I'm 22")

    println("is this true? ${1==0}")
    println("this is 2\$a") // $자체를 String 으로 print 하고 싶을 때

    // 4. 주석
    // 한 줄 주석
    /*
    * 여러 줄 주석
    * */
    // control + /
    /*
     control + shift + /
     */

    checkNum(1)
}

// 1. 함수

fun helloWorld(){
    println("Hello World!")
}

fun add(a: Int, b: Int): Int { // : 뒤가 return type
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

    val c = 100 // Int 적지 않아도 알아서 할당
    var d = 100 // Int 적지 않아도 알아서 할당

    var name = "dabin" // String 적지 않아도 알아서 할당
}

// 5. 조건식
fun maxBy(a: Int, b: Int): Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}

fun maxBy2(a : Int, b : Int) = if(a > b) a else b // Expression

fun checkNum(score: Int) {
    when (score) { // Statement
        0 -> println("this is 0")
        1 -> println("this is 1")
        2, 3 -> println("this is 2 or 3")
        //else -> println("I don't know") 없어도 됨
    }

    var b = when (score) { // Expression
        1 -> 1
        2 -> 2
        else -> 3 // 이렇게 쓸 경우 else 를 항상 써야 함
    }

    println("b : ${b}")

    when (score) {
        in 90..100 -> println("You are genius")
        in 10..80 -> println("not bad")
        else -> println("okay") // else 는 없어도 됨
    }
}

// 6. Expression vs Statement
// 뭔가 값을 만들면 Expression
// Statement는 ~~이렇게 해 같은 명령을 지시하는 것
// Kotlin의 모든 함수는 Expression
// 아무것도 return하지 않아도 :Unit 을 return하기 때문에!
// Java 에서 void들어간 것은 Statement
