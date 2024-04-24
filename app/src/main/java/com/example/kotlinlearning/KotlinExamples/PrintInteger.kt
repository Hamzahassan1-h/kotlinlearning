package com.example.kotlinlearning.KotlinExamples

fun main (){

    print ("Enter a number: ")

    val stringInput = readLine()!!

    val IntegerInput : Int = stringInput.toInt()

    println("You entered a number: $IntegerInput")

}