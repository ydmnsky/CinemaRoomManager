import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val myArray = IntArray(scanner.nextInt())
    for (i in myArray.indices) { myArray[i] = scanner.nextInt() }
    val m = scanner.nextInt()
    if (myArray.contains(m)) { println("YES") } else { println("NO") }
}