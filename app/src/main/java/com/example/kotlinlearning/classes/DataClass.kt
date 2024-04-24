package com.example.kotlinlearning.classes


//data classes
data class Decoration(val rocks: String) {
    fun makeDecorations() {
        val decoration1 = Decoration("granite")
        println(decoration1)
    }
}

fun main(){
    val decoration = Decoration("granite") // Create an instance of the Decoration class
    decoration.makeDecorations() // Call the makeDecorations() method
}