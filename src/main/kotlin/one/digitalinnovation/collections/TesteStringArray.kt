package one.digitalinnovation.collections

fun main() {
    val fruits = Array<String>(4) {""}
    fruits[0] = "Cherry"
    fruits[1] = "Apple"
    fruits[2] = "Orange"
    fruits[3] = "Banana"

    println(fruits.joinToString())
    println("----------------------")
    fruits.sort()
    println(fruits.joinToString())

    println("----------------------")
    val fruits2 = arrayOf("Mango", "Tomato", "Pineapple", "Strawberry")
    fruits2.sort()
    println(fruits2.joinToString())
}