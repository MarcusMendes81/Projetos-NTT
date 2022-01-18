package one.dio.digionebank.teste

import one.dio.digionebank.Funcionario
import java.math.BigDecimal

fun main(){
    val funcionario1 = Funcionario("Fulano de tal", "123.123.123-12", BigDecimal.valueOf(2500))
    println(funcionario1.nome)
    println(funcionario1.cpf)
    println(funcionario1.salario)
}