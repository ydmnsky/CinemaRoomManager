fun main() {
    for (i in readLine()!!.toCharArray()) {
        if (i.isDigit()) {
            println(i)
            break
        }
    }
}