package Lec04

import com.lannstark.lec04.JavaMoney

fun main() {

    val money1 = JavaMoney(1_000L)
    val money2 = JavaMoney(1_000L)
    val money3 = money1

    if(money1 > money2){
        println("Money1이 Money2보다 금액이 큽니다.")
    }

    println(money1 === money3)
    println(money1 === money2)
    println(money1 == money2)
    println(money1 + money2)


}