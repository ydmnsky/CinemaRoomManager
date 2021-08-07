fun main() {
    var sum = 0
    do {
        val a = readLine()!!.toInt()
        sum += a
    } while (a != 0)
    println(sum)
}