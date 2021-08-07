fun main() {
    val a = readLine()!!.toLong()
    val b = readLine()!!.toLong()
    var ans = 1L
    for (i in a until b) { ans *= i }
    println(ans)
}