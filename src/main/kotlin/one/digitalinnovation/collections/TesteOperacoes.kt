package one.digitalinnovation.collections

import java.text.DecimalFormat

fun main() {
    val salarios = doubleArrayOf(2300.0, 6400.0, 3700.0, 1200.0, 5400.0, 7200.0, 8100.0, 4200.0)
    println(salarios.joinToString { "R$$it" })

    println("-------------------------------------")
    println("Maior salário: ${salarios.maxOrNull() }")
    println("Menor salário: ${salarios.minOrNull() }")
    println("Média salarial: ${DecimalFormat("#.0").format(salarios.average())}")

    println("-------------------------------------")
    val salarioMairQue5000 = salarios.filter { it > 5000.0 }
    println("Salários maiores que 'R$5000.0': ${salarioMairQue5000.joinToString { "R$$it" }}")

    println("-------------------------------------")
    println("Quantidade de salários entre R$2500.0 e R$7000.0: ${salarios.count { it in 2500.0..7000.0 }}")

    println("-------------------------------------")
    println("Existe o salário R$5400.0 na lista? ${salarios.find { it == 5400.0 }}")

    println("-------------------------------------")
    println("Existe o salário R$4200.0 na lista? ${salarios.any { it == 4200.0 }}")


}