import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val sizeOfArray = scanner.nextInt()
    val myArray = IntArray(sizeOfArray)
    for (i in 0 until sizeOfArray) {
        myArray[i] = scanner.nextInt()
    }
    val p = scanner.nextInt()
    val m = scanner.nextInt()
    if (myArray.contains(p) && myArray.contains(m)) { print("YES") } else { print("NO") }
}