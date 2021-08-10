fun main() {
    val char = readLine()!!.first()
    for (i in 'a'..'z') {
        if (i == char) { break }
        print(i)
    }
}
