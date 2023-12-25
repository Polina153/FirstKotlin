import java.util.*
import kotlin.random.Random

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

    /* do {
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
     println("See you later!")*/
    /*    var a = 5
        while (a < 5) {
            println("Hey")
        }
        do {
            println("Hello")
            a++
        } while (a < 5)
        println(a)*/
    println("Hello! Let's play!")
    do {
        var counter: Int = 3
        val numberGenerated = startingGame(counter)
        for (i in 1..3) {
            var playerTry = userTries()
            analizeNumbers(numberGenerated, playerTry)
            counter--
        }
        questionToUser()//FIXME counter 3 again if agreed
    } while (/*agree == "yes" && */counter != 0)//FIXME add agree option

    println("Good bye!See you later! Come back again!!")

}

fun questionToUser() {
    println("Do you want to continue? yes/no")
    var agree = Scanner(System.`in`).next().toLowerCase()
    while(agree !=  "yes" && agree !=  "no"){
        println("Your answer is wrong! Try again")
        agree = Scanner(System.`in`).next().toLowerCase()
    }
}

fun analizeNumbers(randomNumber: Int, playerNumber: Int) {
    when (playerNumber) {
        randomNumber -> {
            println("\n Yes! Congratulation! You are winner!!!!")//FIXME stop game circle
        }
        in 1..randomNumber -> println("\n No! Your number is less ! ")
        in randomNumber..10 -> println("\n No! Your number is greater! ")
        else -> println("\n Your range is wrong!!")
    }
}

fun userTries(): Int {
    println(" Print any number from 1 until 10. ")
    val playerNumber = Scanner(System.`in`).nextInt()
    return playerNumber
}

fun startingGame(counter: Int): Int {
    println("You have $counter attempts! ")
    val randomNumber = Random.nextInt(1, 11)
    println(randomNumber)
    return randomNumber
}

