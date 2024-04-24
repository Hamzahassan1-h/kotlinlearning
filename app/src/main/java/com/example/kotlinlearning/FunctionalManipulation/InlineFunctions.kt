package com.example.kotlinlearning.FunctionalManipulation

inline fun myWith(name: String, block: String.() -> Unit) {
    name.block()
}

fun main() {
    val fish = Fish("Flipper")
    myWith(fish.name) {
        capitalize()
    }
    println(fish.name) // Prints: Flipper
}