package one.digitalinnovation.collections

fun main() {
    val samuel = Funcionario("Samuel", 6700.0, "PJ")
    val gabriel = Funcionario("Gabriel", 8500.0, "CLT")
    val lorena = Funcionario("Lorena", 2500.0, "CLT")

    val funcionariosTI = setOf(samuel, gabriel)
    val funcionariosRH = setOf(lorena)

    val funcionarios = funcionariosTI.union(funcionariosRH)
    funcionarios.forEach { println(it) }

    println("-------------------------------------")
    val funcionariosTotais = setOf(samuel, gabriel, lorena)
    val demissaoTI = funcionariosTotais.subtract(funcionariosTI)
    demissaoTI.forEach { println(it) }

    println("-------------------------------------")
    val funcionariosFesta = funcionariosTotais.intersect(funcionariosTI)
    funcionariosFesta.forEach { println(it) }

}