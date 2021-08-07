fun main() {
    val n = readLine()!!.toInt()
    var smaller: Int = 0
    var larger: Int = 0
    repeat(n) {
        val signal = readLine()!!.toInt()
        if (signal == 1) larger++ else if (signal == -1) smaller++
    }
    println("${n - larger - smaller} $larger $smaller")
}