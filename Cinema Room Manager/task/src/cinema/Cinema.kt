package cinema


fun printMap(cinemaHall: Array<CharArray>) {
    println("Cinema:")
    for (i in cinemaHall.indices) {
        if (i == 0) {
            print("  ")
        } else {
            print("$i ")
        }
        for (j in cinemaHall[i].indices) {
            print("${cinemaHall[i][j]} ")
        }
        println()
    }
    println()
}



fun main() {
    // Read cinema hall size
    println("Enter the number of rows: ")
    val rows = readLine()!!.toInt()
    println("Enter the number of seats in each row: ")
    val seats = readLine()!!.toInt()
    println()
    var a = 0
    var soldTickets = 0
    var currentIncome = 0
    val totalSeats = rows * seats
    val totalIncome = if (totalSeats <= 60) {
        totalSeats * 10
    } else {
        rows / 2 * seats * 10 + (rows - rows / 2) * seats * 8
    }
    var cinemaHall = arrayOf(CharArray(0))
    for (i in 1..rows) {
        var array = CharArray(0)
        for (j in 1..seats) {
            array += 'S'
        }
        cinemaHall += array
    }
    var array = CharArray(0)
    for (i in 1..seats) {
        array += i.digitToChar()
    }
    cinemaHall[0] = array

    var answer = 10
    while (answer != 0) {
        print("1. Show the seats\n" +
                "2. Buy a ticket\n" +
                "3. Statistics\n" +
                "0. Exit\n")
        answer = readLine()!!.toInt()
        println()
        when (answer) {
            1 -> printMap(cinemaHall)
            2 -> {
                a = 0
                while (a == 0) {
                    println("Enter a row number:")
                    val row = readLine()!!.toInt()
                    println("Enter a seat number in that row:")
                    val seat = readLine()!!.toInt()
                    try {
                        if (cinemaHall[row][seat - 1] == 'S') {
                            cinemaHall[row][seat - 1] = 'B'
                            currentIncome += if (totalSeats <= 60) {
                                println("Ticket price: \$10")
                                10
                            } else {
                                if (row <= rows / 2) {
                                    println("Ticket price: \$10")
                                    10
                                } else {
                                    println("Ticket price: \$8")
                                    8
                                }
                            }
                            soldTickets++
                            a++
                        } else {
                            println("That ticket has already been purchased!")
                        }
                    } catch (e: Exception) {
                        println("Wrong Input!")
                    }
                    println()

                }
            }
            3-> {
                println("Number of purchased tickets: $soldTickets")
                println("Percentage: ${ "%.2f".format(soldTickets.toDouble() / totalSeats * 100)}%")
                println("Current income: \$$currentIncome")
                println("Total income: \$$totalIncome")
                println()
            }
            0 -> {  }
        }
    }
}