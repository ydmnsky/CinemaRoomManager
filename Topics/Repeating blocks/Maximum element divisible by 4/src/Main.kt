fun main() {
    val n = readLine()!!.toInt()
    var max = 0
    var tmpNum = 0
    repeat(n) {
        tmpNum = readLine()!!.toInt()
        if (tmpNum % 4 == 0 && tmpNum > max) max = tmpNum
    }
    println(max)
}