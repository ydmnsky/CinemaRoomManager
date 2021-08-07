fun main() {
    try {
        val a = 0/0 // throws ArithmeticException
    }
    finally {
        println("End of the try block") // will be executed
    }
    println("End of the program") // will not be printed
}