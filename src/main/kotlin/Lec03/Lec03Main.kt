package Lec03

import com.lannstark.lec03.Person

fun main() {
    //자바는 암시적으로 변환이 가능하지만
    //코틀린은 명시적으로 타입 변환을 해줘야 한다.
    val number1 = 3
    val number2 : Long = number1.toLong()

    val number3 = number1/number2.toDouble()
    val number4 : Int? = number1.toInt()

    val person = Person("개발자", 100)
    val index = "${person.name}뭐라고 해서 쓰는 중이긴함${person.age}"

    val str = "ABCDE"
    val ch = str[0]
    println(ch)
}

fun printAgeIfPerson(obj: Any) {
    if (obj is Person) {
        val person = obj as Person
        println(person.age)
//        obj.age //변환 안해주고 바로 사용할 수도 있음 <- 스마트 캐스트
    }
//    if (obj !is Person) {} //해당 타입이 아니라면
}

fun printAgeIfPerson2(obj: Any?) {
    val person = obj as? Person
    println(person?.age)
}