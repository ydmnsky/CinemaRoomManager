fun main() {
    var a = readLine()!!.toInt()
    var max = Int.MIN_VALUE
    while (a != 0) {
        if (a > max) { max = a }
        a = readLine()!!.toInt()
    }
    println(max)
}