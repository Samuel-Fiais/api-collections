package one.digitalinnovation.collections

fun main() {
    val samuel = Funcionario("Samuel", 6700.0, "PJ")
    val gabriel = Funcionario("Gabriel", 8500.0, "CLT")
    val lorena = Funcionario("Lorena", 2500.0, "CLT")

    val funcionarios = mutableListOf(samuel, gabriel, lorena)
    funcionarios.forEach { println(it) }

    println("------------ List -----------")
    val pedro = Funcionario("Pedro", 4500.0, "PJ")
    funcionarios.add(pedro)
    funcionarios.forEach { println(it) }

    println("-----------------------")
    funcionarios.remove(gabriel)
    funcionarios.forEach { println(it) }

    println("----------- SET ------------")
    val funcionariosSet = mutableSetOf(pedro)
    // funcionariosSet.forEach { println(it) }
    funcionariosSet.add(samuel)
    funcionariosSet.add(lorena)
    funcionariosSet.forEach { println(it) }
}