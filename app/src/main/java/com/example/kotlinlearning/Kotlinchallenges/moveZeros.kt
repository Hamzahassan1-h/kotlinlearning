package com.example.kotlinlearning.Kotlinchallenges


import org.junit.Test
import org.junit.Assert.*


fun moveZeros(list: List<Int>): List<Int> {
    val resultList = mutableListOf<Int>()
    var zeroCount = 0

    //iterate through list count zeros then collect the non-zero elements
    for (item in list) {
        if (item == 0 ) {
            zeroCount++
        } else {
            resultList.add(item)
        }

        resultList.add(0)
    }


    return resultList
}
/*
class MainTest {
    @Test
    fun `long list has zeros moved to the end`() {
        val testList = listOf(1, 2, 5, 0, 5, 7, 3, 0, 1, 0, 14, 35, 0, 65)
        val movedZerosList = moveZeros(testList)
        assertEquals(
            listOf(1, 2, 5, 5, 7, 3, 1, 14, 35, 65, 0, 0, 0, 0),
            movedZerosList
        )
    }
}
*/
