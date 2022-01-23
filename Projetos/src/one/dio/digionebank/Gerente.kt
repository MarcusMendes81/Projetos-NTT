package one.dio.digionebank

class Gerente (
    nome: String,
    cpf: String,
    salario:Double,
    val senha:String
):Funcionario(nome=nome,cpf=cpf,salario=salario),Logavel{
    override fun CalculoAux(): Double =  salario * 0.4
    override fun imprimeDados() {
        println("nome: $nome")
        println("cpf:  $cpf" )
    }
    override fun Login(): Boolean = "senha123" == senha
}