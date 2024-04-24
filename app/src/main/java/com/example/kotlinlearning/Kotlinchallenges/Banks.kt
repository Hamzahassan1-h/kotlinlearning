package com.example.kotlinlearning.Kotlinchallenges

import java.time.LocalDate
import java.time.format.DateTimeFormatter

fun isValidCard(cardNumber: String, currentDate: LocalDate = LocalDate.now()): Boolean {
    //using the to keyword we create a pair of values which is then passed to the mapOf function.
    val bankCodes = mapOf(
        "1121" to "ACME",
        "1111" to "ALFA",
        "3796" to "AMEX"
    )

    // Extract the first 4 digits to identify the bank
    // using substring method from index 'o' to '4'
    val bankCode = cardNumber.substring(0, 4)

    // Extract the last 4 digits to decode the expiry date
    val expiry = cardNumber.takeLast(4)
    val expiryDate = "20${expiry.substring(2, 4)}-${expiry.substring(0, 2)}-01"

    // Parse expiry date and check validity
    val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd")
    val dateOfExpiry = LocalDate.parse(expiryDate, formatter)

    //checking if it is valid and not expired yet
    return bankCodes.containsKey(bankCode) && dateOfExpiry.isAfter(currentDate)
}

fun main() {

    // Assuming current date is before March 2012
    println(isValidCard("1121-0000-0000-0312"))

    println(isValidCard("1111-0000-0000-0312"))
}
