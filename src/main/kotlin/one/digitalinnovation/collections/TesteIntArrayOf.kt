package one.digitalinnovation.collections

fun main() {
    val values = intArrayOf(23, 12, 89, 45, 3, 67)

    values.forEach { println(it) }
    println("----------------------")

    values.sort()
    values.forEach { println(it) }

}