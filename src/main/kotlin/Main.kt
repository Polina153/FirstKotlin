import java.util.*

fun main(args: Array<String>) {

    /*while (true) {
        println("How much money do you have ?")
        val howMuchMoney = Scanner(System.`in`).nextInt()

        if (howMuchMoney > 500) {
            println("You can buy a pizza !")
        } else if (howMuchMoney in 300..500) {
            println("You can buy a pasta ! ")
        } else if (howMuchMoney in 100..299) {
            println("You can buy a hamburger !")
        } else if (howMuchMoney in 1..99) {
            println("You can buy pamen !")
        } else {
            println("Go to foodbank!")
            break
        }
        println()
        println()
    }
    println("See you later, with money")*/

    /*    var i = 1
        while (i <= 1000) {
            println(i)
            if (i == 5) {
                break
            }
            i++
        }*/

    do {
        println("How much money do you have for a lunch?")

        when (Scanner(System.`in`).nextInt()) {
            in 0..99 -> {
                println("You can buy pamen !")
            }

            in 100..299 -> {
                println("You can buy a hamburger !")
            }

            in 300..499 -> {
                println("You can buy a pasta ! ")
            }

            in 500..1_000_000 -> {
                println("You can buy a pizza !")
            }

            else -> {
                println("Go to foodbank !")
            }
        }
        println()
        println()
        println("Do you want to continue? yes/no")
        val userAnswer = Scanner(System.`in`).next().toLowerCase()
    } while (userAnswer == "yes")
    println()
    println("See you later!")
    /*    var a = 5
        while (a < 5) {
            println("Hey")
        }
        do {
            println("Hello")
            a++
        } while (a < 5)
        println(a)*/
}

