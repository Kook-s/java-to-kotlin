package Lec09

public class Person (
    name :String,
    var age:Int
) {

    var name = name
        set(value) {
            field = value.uppercase()
        }

    fun getUppercaseName(): String{
        return this.name.uppercase()
    }

//    val uppercaseName : String
//        get() = this.name.uppercase()

//    val name = name
//        get() = field.uppercase()

    init {
        if (age < 0) {
            throw IllegalArgumentException("나이는 ${age} 살 일 수 없습니다.")
        }
        println("초기화 블럭")
    }

    constructor(name: String) : this(name, 1){
        println("첫번째 부생성자")
    }

    constructor() : this(name = "홍길동"){
        println("두번째 부생성자")

    }

//    fun isAdult(): Boolean {
//        return this.age >= 20
//    }

    val isAdult: Boolean
        get() = this.age >= 20
}

fun main() {
    val person = Person("name", 0)

    println(person.name)
    println(person.getUppercaseName())
    println(person.age)
}