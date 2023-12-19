import java.util.Scanner

fun main(args: Array<String>) {
    /*val days = 5000
    val daysInYear = 365
    val years = days / daysInYear
    //println(years) вывод в консоль
    val months = (days % daysInYear) / 31
    val leftDays = days - years * daysInYear - months * 31
    println("Общее кол-во дней: $days!")
    println("Общее кол-во лет: $years!")
    println("Общее кол-во месяцев: $months!")
    println("Оставшееся кол-во дней: $leftDays!")*/
    //вывод в консоль
    /*    val currentTemp = 30
        if (currentTemp >= 28) {
            println("Conditioner is cooling")
        } else if (currentTemp <= 13) {
            println("Conditioner is warming")
        } else {
            println("Conditioner is off")
        }*/

    /*    println("What is the temperature now ?")
        val currentTemperature = Scanner(System.`in`).nextInt()
        println("What is the time?")
        val currentTime = Scanner(System.`in`).nextInt()
        val isDayTime = 9 <= currentTime && currentTime <= 20//currentTime in 9..20//
        val ifHot = currentTemperature >= 28
        val ifCold = currentTemperature <= 0


        if (ifHot && isDayTime) {
            println("Conditioner is cooling")
        } else if (ifCold || !isDayTime) {
            println("Conditioner is off")
        } else {
            println("Conditioner is warming")
        }


        if (isDayTime) {
            if (ifHot) {
                println("Conditioner is cooling")
            } else if (ifCold) {
                println("Conditioner is off because of cold")
            } else {
                println("Conditioner is warming")
            }
        } else {
            println("Conditioner is off because of late")
        }*/


    /*    println("What time of the day ?")
        val scannerDay = Scanner(System.`in`).next().toLowerCase()
        println("What the weather ?(good/bad)")
        val scannerWeather = Scanner(System.`in`).next().toLowerCase()


        if (scannerDay == "night") {
            println("Go to bed !")
        } else if (scannerDay == "day" && scannerWeather == "good") {
            println(" Go to walk !")
        } else if (scannerDay == "day" && scannerWeather == "bad") {
            println("To read book !")
        } else{
            println("Sorry, can't understand")
        }*/

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

    var i = 1
    while (i <= 1000){
        println(i)
        if(i == 5){
            break
        }
        i++
    }
}

