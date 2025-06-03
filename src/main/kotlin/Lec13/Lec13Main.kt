package Lec13

import com.lannstark.lec13.JavaHouse


class House(
    private val address: String,
    private val livingRoom: JavaHouse.LivingRoom
){

//    class LivingRoot(
//        private var area:Double
//    )

    inner class LivingRoom(
        private var area: Double,
    ) {
        val address: String
            get() = this@House.address
    }

}

