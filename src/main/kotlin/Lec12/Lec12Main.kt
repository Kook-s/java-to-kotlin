package Lec12

import com.lannstark.lec12.Movable

fun main() {

    moveSomething(object : Movable {
        override fun move() {
            print("무브 무브")
        }

        override fun fly() {
            print("날다 날다")
        }
    })
}

private fun moveSomething(movable: Movable) {
    movable.move()
    movable.fly()
}

class Person private constructor(
    var name : String,
    var age : Int,
) {

    companion object Factory : Log{
        private const val MIN_AGE = 1
        fun newBaby(name: String): Person {
            return Person(name, MIN_AGE)
        }

        override fun log() {
            println("Person 동행 객체")
        }
    }

}

object Singleton {
    var a: Int = 0
}