package com.example.kotlinlearning.Kotlinchallenges


fun findLongestWord(value: String): String {
    // Remove punctuation and split the string into words
    val words = value.replace(Regex("[^\\w\\s]"), "").split("\\s+".toRegex())

    // Use maxByOrNull to find the longest word; it returns the first occurrence of the longest length
    return words.maxByOrNull { it.length } ?: ""
}

fun main() {
    val testSentence = "Find the longest word in this string while ignoring punctuation. "

    println(findLongestWord(testSentence)) 
}