package com.example.kotlinlearning.classes

fun main (){
    val seaLion = SeaLion()
    val walrus = Walrus()

    println("Matching sea lion: ${matchSeal(seaLion)}") // Prints "Matching sea lion: sea lion"
    println("Matching walrus: ${matchSeal(walrus)}") // Prints "Matching walrus: walrus"
}


sealed class Seal
class SeaLion : Seal()
class Walrus : Seal()

fun matchSeal(seal: Seal): String {
    return when(seal) {
        is Walrus -> "walrus"
        is SeaLion -> "sea lion"
    }
}