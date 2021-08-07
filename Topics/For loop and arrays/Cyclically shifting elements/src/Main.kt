import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val arraySize = scanner.nextInt()
    val myArray = IntArray(arraySize)
    for (i in 0 until arraySize) {
        myArray[i] = scanner.nextInt()
    }
    val a = myArray[arraySize - 1]
    for (i in arraySize - 1 downTo 1) {
        myArray[i] = myArray[i - 1]
    }
    myArray[0] = a
    print(myArray.joinToString(separator = " "))
}