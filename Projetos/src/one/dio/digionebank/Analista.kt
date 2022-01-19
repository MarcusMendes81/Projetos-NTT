package one.dio.digionebank

import java.math.BigDecimal

class Analista(nome: String, cpf: String, salario: Double):Funcionario(nome, cpf, salario) {
    override fun CalculoAux() = salario * 0.1
    override fun imprimeDados() {
        println("Analista: "+this.nome)
        println("cpf: "+this.cpf)
        println("Salario: "+this.salario+" R$")
        println("Auxilio: "+CalculoAux())
    }
}
