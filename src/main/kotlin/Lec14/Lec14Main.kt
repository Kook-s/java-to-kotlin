package Lec14

fun main() {
    val dto1 = PersonDto("홍길동", 100)
    val dto2 = PersonDto("홍길동", 200)
    println(dto1)
    println(dto1 == dto2)
}

data class PersonDto(
    val name: String,
    val age: Int
)

enum class Country(
     private val code: String,
){
    KOREA("KO"),
    AMERICA("US")
    ;


}

fun handleCountry(country: Country){
    when(country){
        Country.KOREA -> TODO()
        Country.AMERICA -> TODO()
    }
}