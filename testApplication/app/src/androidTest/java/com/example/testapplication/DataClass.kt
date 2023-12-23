package com.example.testapplication

data class Ticket(val companyName: String, val name: String, var date: String, var seatNumber: Int)
// toString(), hashCode(), equals(), copy()

class TicketNormal(val companyName: String, val name: String, var date: String, var seatNumber: Int)


fun main() {
    val ticketA = Ticket("koreanAir", "dabinChoi", "2020-02-16", 14)
    val ticketB = TicketNormal("koreanAir", "dabinChoi", "2020-02-16", 14)

    println(ticketA) // 보기 편하게 print 해줌
    println(ticketB) // 메모리 주소 값이 나옴
}