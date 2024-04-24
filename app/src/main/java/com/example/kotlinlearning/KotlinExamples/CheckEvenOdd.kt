package com.example.kotlinlearning.KotlinExamples

fun main (){

    //Check whether a number is even or odd
    print ("Enter a number ")

    val stringInput : String = readLine()!!

    var IntegerInput : Int = stringInput.toInt()

    val evenOdd = if (IntegerInput % 2 == 0) println("Even") else println("Odd")


}