fun main() {
    val n = readLine()!!.toInt()
    var j = 1
    var i = 1
    var k = 1
    while (j <= n) {
        print("$k ")
        if (i >= k) {
            k++
            i = 0
        }
        i++
        j++
    }
}