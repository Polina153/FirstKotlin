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
    while (true) {

        println("How much money do you have for a lunch?")

        val howMuchMoney = Scanner(System.`in`).nextInt()

        /*val rich = howMuchMoney > 500
        val notRich = howMuchMoney in 300..500
        val medium = howMuchMoney in 100..299
        val poor = howMuchMoney in 0..99*/
        when (howMuchMoney) {
            in 0..99 -> println("You can buy pamen !")
            in 100..299 -> println("You can buy a hamburger !")
            in 300..499 -> println("You can buy a pasta ! ")
            in 500..1_000_000 -> println("You can buy a pizza !")
            else -> println("Go to foodbank !")
        }

        /*if (rich) {
            println("You can buy a pizza !")
        } else if (notRich) {
            println("You can buy a pasta ! ")
        } else if (medium) {
            println("You can buy a hamburger !")
        } else if (poor) {
            println("You can buy pamen !")
        } else {
            println("Go to foodbank !")
            break
        }*/
        println()
        println()
    }
    println("See you later!")
}

