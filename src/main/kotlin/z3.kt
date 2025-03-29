fun main() {
    val num1 = 2
    val num2 = 6

    println("У вас есть числа: $num1 и $num2")
    println("1. Добавить")
    println("2. Отнять")
    println("0. Ничего")

    val choice = readln().toInt()

    val result = when (choice) {
        1 -> num1 + num2
        2 -> num1 - num2
        else -> "Операция отменена"
    }

    println("Результат: $result")
}