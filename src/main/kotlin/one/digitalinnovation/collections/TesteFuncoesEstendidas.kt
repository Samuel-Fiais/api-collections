package one.digitalinnovation.collections

fun main() {
    val salarios = arrayOf(
        "2000".toBigDecimal(),
        "6700".toBigDecimal(),
        "1450".toBigDecimal()
    )
    println(salarios.joinToString())
    println("Soma dos salários: ${salarios.somatoria()}")
    println("Média dos salários: ${salarios.media()}")
}