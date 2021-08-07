fun main() {
    val n = readLine()!!.toInt()
    var a = readLine()!!.toInt()
    var min = a
    for (i in 1 until n) {
        a = readLine()!!.toInt()
        if (a < min) { min = a }
    }
    println(min)
}