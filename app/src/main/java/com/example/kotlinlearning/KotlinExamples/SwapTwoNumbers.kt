package com.example.kotlinlearning.KotlinExamples

fun main (){
    //swap numbers
    var first : Int = 4
    var second : Int = 3

    //introduce a temporary variable
    var temporary = first
    first = second
    second = temporary


    println(first)
    println(second)
}