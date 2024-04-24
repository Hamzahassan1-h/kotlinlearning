package com.example.kotlinlearning.Extensions.Pairs

//pairs and triples
//a triple using Triple() with 3 values. Use .first, .second and .third to refer to each value.
fun main (){
    val numbers = Triple(6, 9, 42)
    println(numbers.toString())
    println(numbers.toList())


    //Create a pair where the first part of the pair is itself a pair.
    val equipment2 = ("fish net" to "catching fish") to "equipment"
    println("${equipment2.first} is ${equipment2.second}\n")
    println("${equipment2.first.second}")

    //Destructure some pairs and print triples
    val equipment = "fish net" to "catching fish"
    val (tool, use) = equipment
    println("$tool is used for $use")

    //Destructure some pairs and then print triples
    val num = Triple(6, 9, 42)
    val (n1, n2, n3) = num
    println("$n1 $n2 $n3")
}