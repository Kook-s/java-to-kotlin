package Lec05

fun judgeNumber(number: Int) {
    when (number) {
        1, 0, -1 -> print("10-1")
        else -> print("아무것도 아님")
    }
}

fun startWithA(obj: Any): Boolean {
    return when (obj) {
        is String -> obj.startsWith("A")
        else -> false
    }
}

fun validateScoreIsNotNegative(score : Int) {
    if (score in 0..100) {
        throw IllegalArgumentException("${score}범위는 0부터 100이다.")
    }
}

fun getGradeWithSwitch(score : Int): String {
    return when (score / 10) {
        9-> "A"
        8-> "B"
        7-> "C"
        else -> "D"
    }

    return when (score) {
        in 90..99-> "A"
        in 80..89-> "B"
        in 70..79-> "C"
        else -> "D"
    }

}

fun getPassOrFail(score : Int) : String{
//    if (score > 50) {
//        return "P"
//    } else{
//        return "F"
//    }

    return if (score > 50) {
        "P"
    } else{
        "F"
    }
}

fun getGrade(score : Int) : String{
    return if (score >= 90) {
        "A"
    } else if (score >= 80) {
        "B"
    }else if (score >= 80) {
        "D"
    }else{
        "C"
    }
}
