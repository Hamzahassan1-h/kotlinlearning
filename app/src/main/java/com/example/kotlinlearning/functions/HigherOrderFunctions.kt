package com.example.kotlinlearning.functions

fun main (){
    //The use of lambdas
    var dirtyLevel = 20
    val waterFilter = { dirty : Int -> dirty / 2}
    println(waterFilter(dirtyLevel))

    println(result)

}
//creating a higher-order function

fun performOperationOnTwoNumber( a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
}

var result = performOperationOnTwoNumber(3, 4) { x, y -> x + y }



fun add(a: Int, b: Int) : Int {
    return a + b
}
