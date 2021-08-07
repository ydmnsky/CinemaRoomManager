fun main() {
    val n = readLine()!!.toInt()
    var answer = 0
    repeat(n) { if (readLine()!!.toInt() > 0) answer++ }
    println(answer)
}