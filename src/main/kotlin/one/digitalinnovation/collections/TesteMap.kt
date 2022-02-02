package one.digitalinnovation.collections

fun main() {
    val pair: Pair<String, Double> = Pair("Sprite", 4.8)
    val refri = mapOf(pair)

    refri.forEach { (k, v) -> println("Chave: $k = Valor: $v")}

    val volume = mapOf(
        "piscina" to 200.0,
        "banheira" to 50.0
    )
    volume.forEach { (k, v) -> println("Chave: $k = Valor: $v")}
}