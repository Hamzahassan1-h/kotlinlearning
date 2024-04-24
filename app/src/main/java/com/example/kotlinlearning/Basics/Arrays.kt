package com.example.kotlinlearning.Basics

fun main (){
    //Declare an array of strings using arrayOf. Use the java.util.Arrays.toString() array utility to print it out.
    val school: Array<String> = arrayOf("shark", "salmon", "minnow")

   // Iterate over the array and print each element
    for (fish in school) {
        println(fish)
    }

    val mix = arrayOf("fish", 2)
    for (element in mix) {
        println(element)
    }

    val num = intArrayOf(1,2,3)
    for (elements in num){
        println(elements)
    }

    //Combine two arrays with the + operator.
    val numbers:IntArray = intArrayOf(1,2,3)
    val numbers3:IntArray = intArrayOf(4,5,6)
    val foo2 = numbers3 + numbers
    println(foo2[5])

    //combinations of nested arrays and lists
    val num1 = intArrayOf(1, 2, 3)
    val oceans = listOf("Atlantic", "Pacific")
    val oddList = listOf(num1, oceans, "salmon")
    println(oddList)


}