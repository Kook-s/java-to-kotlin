package Lec08

fun main() {
    repeat("hello world")

    printNameAndGender(gender = "FEMALE", name = "개발자")
}

fun max(a : Int , b : Int) : Int{
    return if (a > b) {
        a
    } else {
        b
    }
}

fun repeat(str : String, num : Int = 3, userNewLine : Boolean = true){
    for (i in 1..num) {
        if (userNewLine) {
            println(str)
        } else {
            print(str)
        }

    }
}

fun printNameAndGender(name : String, gender : String){
    println(name)
    println(gender)
}


// printAll("A", "B", "C")
// val array = arrayOf("A", "B", "C")
// printAll(*array)

fun printAll(vararg strings: String) {
    for (str in strings) {
        println(str)
    }
}