fun main() {
    val myArray = IntArray(readLine()!!.toInt())
    for (i in myArray.indices) { myArray[i] = readLine()!!.toInt() }
    var max = Int.MIN_VALUE
    var maxIndex = 0
    for (i in myArray.indices) { if (myArray[i] > max) {
        max = myArray[i]
        maxIndex = i
    } }
    print(maxIndex)
}