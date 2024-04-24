package com.example.kotlinlearning.FunctionalManipulation

//filter lambda
data class Fish(val name: String)

fun main() {
    val myFish = listOf(Fish("Flipper"), Fish("Moby Dick"), Fish("Dory"))
    val filteredFishNames = myFish.filter { it.name.contains("i") }.joinToString(", ") { it.name }
    println(filteredFishNames)
}
