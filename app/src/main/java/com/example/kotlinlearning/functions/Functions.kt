package com.example.kotlinlearning.functions

//create functions
fun feedTheFish() {
    val day = 20
    val food = "pellets"
    println ("Today is $day and the fish eat $food")
}


fun main (){
    feedTheFish()
    swim()


}

//create a default value for a parameter
fun swim(speed: String = "fast") {
    println("swimming $speed")
}

//adding parameters and the use of when, if-else

fun shouldChangeWater(day: String, temperature: Int = 22, dirty: Int = 20): Boolean {
    return when {
        temperature > 30 -> true
        dirty > 30 -> true
        day == "Sunday" ->  true
        else -> false
    }
}


