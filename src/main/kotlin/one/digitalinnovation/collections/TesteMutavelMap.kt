package one.digitalinnovation.collections

fun main() {
    val samuel = Funcionario("Samuel", 6700.0, "PJ")
    val gabriel = Funcionario("Gabriel", 8500.0, "CLT")
    val lorena = Funcionario("Lorena", 2500.0, "CLT")
    val pedro = Funcionario("Pedro", 4500.0, "PJ")


    val repositorio = Repositorio<Funcionario>()
    repositorio.create(samuel.nome, samuel)
    repositorio.create(gabriel.nome, gabriel)
    repositorio.create(lorena.nome, lorena)
    repositorio.create(pedro.nome, pedro)

    repositorio
        .findAll()
        .forEach {  println(it) }

    println("-----------------------------")
    repositorio.remove(gabriel.nome)
    repositorio
        .findAll()
        .forEach {  println(it) }

}