package Lec02

import com.lannstark.lec02.Person

fun main() {

    val str: String? = "ABC"
    println(str?.length)
    println(str?.length ?: 0)

    println(startWithA1("ABC"))
    println(startWithA2("ABC"))
    println(startWithA3("ABC"))
    println(startWithA4("ABC"))

    val person = Person("공부하는 개발자")
//    startWithA(person.name)
}
fun startWithA(str: String): Boolean {
    return str.startsWith("A")
}


fun startWithA1(str: String?): Boolean {
//    if (str == null) {
//        throw IllegalArgumentException("null이 들어왔습니다.")
//    }
//    return str.startsWith("A")
    return str?.startsWith("A") ?: throw IllegalArgumentException("null이 들어왔습니다.")
}

fun startWithA2(str: String?): Boolean? {
//    if (str == null) {
//        return null
//    }
//    return str.startsWith("A")
    return str?.startsWith("A")
}

fun startWithA3(str: String?): Boolean {
//    if(str == null) {
//        return false
//    }
//    return str.startsWith("A")

    return str?.startsWith("A") ?: false
}

fun startWithA4(str: String?): Boolean {
    return str!!.startsWith("A")
}