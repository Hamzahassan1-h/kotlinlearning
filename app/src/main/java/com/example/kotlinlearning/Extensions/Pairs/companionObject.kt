package com.example.kotlinlearning.Extensions.Pairs

//Companion object
//The basic difference between companion objects and regular objects is:
//Companion objects are initialized from the static constructor of the containing class, that is, they are created when the object is created.
//Regular objects are initialized lazily on the first access to that object; that is, when they are first used.
fun main() {
    println(MyClass.Companion.CONSTANT3)
}

class MyClass {
    companion object {
        const val CONSTANT3 = "constant in companion"
    }
}