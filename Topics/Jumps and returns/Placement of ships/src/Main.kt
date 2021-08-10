import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val row1 = scanner.nextInt()
    val column1 = scanner.nextInt()
    val row2 = scanner.nextInt()
    val column2 = scanner.nextInt()
    val row3 = scanner.nextInt()
    val column3 = scanner.nextInt()
    var rows = IntArray(0)
    var columns = IntArray(0)
    for (i in 1..5) {
        if (i == row1 || i == row2 || i == row3) continue
        rows += i
    }
    for (i in 1..5) {
        if (i == column1 || i == column2 || i == column3) continue
        columns += i
    }
    println(rows.joinToString(separator = " "))
    println(columns.joinToString(separator = " "))

}