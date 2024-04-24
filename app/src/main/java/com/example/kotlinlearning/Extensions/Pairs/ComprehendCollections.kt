package com.example.kotlinlearning.Extensions.Pairs

 fun main (){
     //a list of numbers and call sum() on it. This sums up all the elements.
     val list = listOf(1, 5, 3, 4)
     println(list.sum())

     //sum up the length of the string using .sumBy()
     var list2 = listOf("a", "bbb", "cc")
     println(list2.sumBy {it.length})

     //Create it with a fish net in it, then add 3 tank scrubbers into the inventory with put(), and remove the fish net with remove().
     val inventory = mutableMapOf("fish net" to 1)
     inventory.put("tank scrubber", 3)
     println(inventory.toString())
     inventory.remove("fish net")
     println(inventory.toString())
 }