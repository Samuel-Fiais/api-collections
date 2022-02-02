package one.digitalinnovation.collections

fun main() {
    val samuel = Funcionario("Samuel", 6700.0, "PJ")
    val gabriel = Funcionario("Gabriel", 8500.0, "CLT")
    val lorena = Funcionario("Lorena", 2500.0, "CLT")

    val funcionarios = listOf(samuel, gabriel, lorena)
    funcionarios.forEach { println(it)}
    println("--------------------------------")
    println(funcionarios.find { it.nome == "Gabriel"})

    println("--------------------------------")
    funcionarios
        .sortedBy { it.salario }
        .forEach { println(it)}

    println("--------------------------------")
    funcionarios
        .groupBy { it.tipoContratacao }
        .forEach { println(it) }

    println("--------------------------------")


}