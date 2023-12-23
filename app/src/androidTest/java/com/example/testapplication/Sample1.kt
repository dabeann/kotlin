package com.example.testapplication

import java.lang.IllegalArgumentException
import java.util.Locale

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

    forAndWhile()

    nullCheck()
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
    val a: Int = 10
    var b: Int = 9

    var e: String // 그냥 선언만 할 때에는 String 이런 type 선언을 해 주어야 함

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

fun maxBy2(a: Int, b: Int) = if(a > b) a else b // Expression

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


// 7. Array and List
// Array는 기본적으로 정해진 size가 있음
// List 1. List(수정X Read Only), 2. MutableList(수정 가능)

fun array() {
    val array = arrayOf(1, 2, 3)
    val list = listOf(1, 2, 3)

    val array2 = arrayOf(1, "d", 3.4f)
    val list2 = listOf(1, "d", 11L)

    array[0] = 3 //가능
    // list[0] = 2 불가능
    var result = list.get(0)

    var arrayList = arrayListOf<Int>() // val을 써도 상관X
    arrayList.add(10)
    arrayList.add(20)
}

// 8. for & while

fun forAndWhile() {

    val students = arrayListOf("joyce", "james", "jenny", "jennifer")

    for (name in students) {
        println("${name}")
    }

    for ((index, name) in students.withIndex()) {
        println("${index+1}번째 학생 : ${name}")
    }


    var sum : Int = 0
    /*for (i in 1..10 step 2) {
        sum += i
    }*/

    /*for (i in 10 downTo 1) {
        sum += i
    }*/

    for (i in 1 until 100) { // 이건 100을 포함하지 않음
        sum += i
    }

    println(sum)

    var index = 0
    while (index < 10) {
        println("current index : ${index}")
        index++
    }
}

// 9. Nullable & NonNull

fun nullCheck() {
    // NPE : NULL Pointer Exception

    var name: String = "dabin"

    var nullName: String? = null // 물음표 넣으면 Nullable 됨

    var nameInUpperCase = name.uppercase()

    var nullNameInUpperCase = nullName?.uppercase() // null이 아니면 uppercase하고 null이면 null 반환

    // ?:

    val lastName: String? = null

    val fullName = name + " " + (lastName ?: "NO lastName")

    var mLastName = lastName ?: throw IllegalArgumentException("No last Name")

    println(fullName)
}

// !!
// 확실하게 null이 아닌 이상 지양해라

fun ignoreNulls(str: String?) {
    val mNotNull: String = str!! // 이거 절대로 null일리 없으니 null 아니라고 생각해라
    val upper = mNotNull.uppercase()

    val email : String? = "dabinXXXX@nana.vom"
    email?.let { // email이 null이 아니면 이걸 해라
        println("my email is ${email}")
    }
}