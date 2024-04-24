package com.example.kotlinlearning.Basics

fun main () {

    //Use the question mark operator, ?, after the type to indicate that a variable can be null. Declare an Int? and assign null to it.
    // use of the safeCall operator
    var marbles:Int? = null
    println(marbles)

    //use of the ElvisOperator(?:)
    var fishFood = 6
    fishFood = fishFood?.dec() ?: 0
    println (fishFood)




}
