fun main() {
    print("Введите два числа: ")
    val (x, y) = readln().split(" ").map { it.toInt() }

    println((x % 2 == 0 && y % 2 == 0))
}