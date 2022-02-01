package one.digitalinnovation.collections

fun main() {
    val salarios = DoubleArray(4)
    salarios[0] = 1000.0
    salarios[1] = 2000.0
    salarios[2] = 3500.0
    salarios[3] = 5000.0

    salarios.forEach { println(it) }
    println("----------------------")

    salarios.forEachIndexed { index, salario ->
        salarios[index] = salario * 1.5
    }
    salarios.forEach { println(it) }
    println("----------------------")

    val salariosChefes = doubleArrayOf(15_000.0, 20_000.0, 25_000.0, 30_000.0)
    salariosChefes.forEach { println(it) }
}