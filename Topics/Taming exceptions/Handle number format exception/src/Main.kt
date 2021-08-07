fun parseCardNumber(cardNumber: String): Long {
    if (cardNumber.split(" ").size != 4) {
        throw Exception("Not a credit card number")
    }
    val cardNumberStr = cardNumber.split(" ").joinToString(separator = "")
    if (cardNumberStr.length != 16) {
        throw Exception("Not a credit card number")
    }
    return cardNumberStr.toLong()
}