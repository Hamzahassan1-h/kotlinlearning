package com.example.kotlinlearning.Basics

fun main (){
    //if_else statement
    /*val numberOfFish = 50
    val numberOfPlants = 23
    if (numberOfFish > numberOfPlants) {
        println("Good ratio!")
    } else {
        println("Unhealthy ratio")
    }*/

    //condition for ranges
    /*
    val fish = 50
    if (fish in 1..100){
        println(fish)
    }
    */

/*
    //if with multiple cases
    val numberOfFish = 50

    if (numberOfFish == 0) {
        println("Empty tank")
    } else if (numberOfFish < 40) {
        println("Got fish!")
    } else {
        println("That's a lot of fish!")
    }
   */

    //when statement
    val numberOfFish = 50
    when (numberOfFish) {
        0  -> println("Empty tank")
        in 1..39 -> println("Got fish!")
        else -> println("That's a lot of fish!")
    }
}