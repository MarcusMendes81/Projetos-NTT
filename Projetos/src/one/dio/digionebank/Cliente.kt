package one.dio.digionebank

class Cliente(
    nome:String,
    cpf:String,
    val ClienteTipo: ClienteTipo,
    val senha:String
    ):Pessoa(nome,cpf),Logavel
{
    override fun Login(): Boolean = "123456" == senha
    override fun imprimeDados() {
        println("Nome: $nome")
        println("CPF:  $cpf")
        println("Tipo: ${ClienteTipo.descricao}")
    }

}