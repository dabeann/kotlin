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

    val c = 100 // Int 적지 않아도 알아서 할당
    var d = 100 // Int 적지 않아도 알아서 할당

    var name = "dabin" // String 적지 않아도 알아서 할당
}