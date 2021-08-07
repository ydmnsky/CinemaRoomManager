fun main() {    
    val numbers = readLine()!!.split(' ').map { it.toInt() }.toIntArray()
    // Do not touch lines above
    // Write only exchange actions here.
    val c = numbers.first()
    val d = numbers.last()
    numbers[0] = d
    numbers[numbers.lastIndex] = c
    // Do not touch lines below
    println(numbers.joinToString(separator = " "))
}
