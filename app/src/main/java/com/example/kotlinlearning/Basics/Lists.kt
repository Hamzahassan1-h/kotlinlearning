package com.example.kotlinlearning.Basics

fun main (){
    //making lists and declare a list using listOf
    val school =listOf("mackerel", "trout", "halibut")
    println(school)

    //Declare a list that can be changed using mutableListOf. Remove an item.
    val myList = mutableListOf("tuna", "salmon", "shark")
    myList.remove("shark")
    println(myList)
}