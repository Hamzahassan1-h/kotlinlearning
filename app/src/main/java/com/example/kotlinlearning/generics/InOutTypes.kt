package com.example.kotlinlearning.generics


interface Cleaner<in T: WaterSupply> {
    fun clean(waterSupply: T)
}

class TapWaterCleaner : Cleaner<TapWater> {
    override fun clean(waterSupply: TapWater) = waterSupply.addChemicalCleaners()
}

class Aquarium<out T: WaterSupply>(val waterSupply: T) {
    fun addWater(cleaner: Cleaner<T>) {
        if (waterSupply.needsProcessing) {
            cleaner.clean(waterSupply)
        }
        println("water added")
    }

    fun genericsExample() {
        val cleaner = TapWaterCleaner()
        val aquarium = Aquarium(TapWater())
        aquarium.addWater(cleaner)
    }
}