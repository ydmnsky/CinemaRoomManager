fun main() {
    val str = readLine()!!
    var ans = 0
    for (i in str.indices) {
        var x = 1
        for (j in str.indices) {
            if (i == j) {
                continue
            }
            if (str[i] == str[j]) {
                x = 0
            }
        }
        ans += x
    }
    println(ans)
}
