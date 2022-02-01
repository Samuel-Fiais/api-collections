package one.digitalinnovation.collections

fun main() {
    val values = IntArray(5)

    values[0] = 4
    values[1] = 1
    values[2] = 13
    values[3] = 7
    values[4] = 10

    for (value in values) {
        println(value)
    }
    println("----------------------")

    values.forEach { println(">> $it <<") }
    println("----------------------")

    for (index in values.indices) {
        println("$index >> ${values[index]}")
    }
    println("----------------------")

    values.sort()
    values.forEach { print("$it ") }
}