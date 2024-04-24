package com.example.kotlinlearning.Basics

// Declares the variable x and initializes it with the value of 5
//using var keyword
fun main() {

    //operator types and a practice of data types

    /*val i: Int = 6

    val b1 = i.toByte()

    println(b1)*/
    /*
    val b2: Byte = 1 // OK, literals are checked statically
    println(b2)

    val i4: Int = b2.toInt() // OK!
    println(i4)


    val i5: String = b2.toString()
    println(i5)


    val i6: Double = b2.toDouble()
    println(i6)
*/

    // creating a stringTemplate
    val numberOfFish = 5
    val numberOfPlants = 12
    println("I have $numberOfFish fish" + " and $numberOfPlants plants")


    /*var x:Int = 5
    //Reassigns a new value of 6 to the variable
    x += 1
    println(x)

     */


    //Declare variable x with value of 5
    /*
//val x = 5
// Initializes the variable x at the moment of declaration; type is not required
    val x = 5
// Declares the variable c without initialization; type is required
    val c: Int
// Initializes the variable c after declaration
    c = 3

    println(c)
    println(x)

*/
//You can declare variables at the top level:
   /* val PI = 3.14
    var x = 0

    fun incrementX() {
        x += 1

    }
    println(incrementX())
    println(PI)
// x = 0; PI = 3.14
// incrementX()
// x = 1; PI = 3.14

    */
}
