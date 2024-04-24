package com.example.kotlinlearning.FunctionalManipulation


class Plant{
    fun testAnnotations() {
        val plantObject = Plant::class
        for (a in plantObject.annotations) {
            println(a.annotationClass.simpleName)
        }
    }
}


