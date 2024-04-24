package com.example.kotlinlearning.generics

fun main() {
    val tapWater = TapWater()
    println("Tap water needs processing: ${tapWater.needsProcessing}")
}

open class WaterSupply(var needsProcessing: Boolean)

class TapWater : WaterSupply(true) {
    fun addChemicalCleaners() {
        needsProcessing = false
    }

}

