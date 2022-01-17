package one.dio.digionebank

class Pessoa {
    var nome:String = "Marcus Mendes"
    var cpf:String = "123.123.123-12"
    inner class endereco {
        val rua:String = "Rua: Teste"
        val numero:Int = 123
        val bairro:String = "Bairro: Testando"
    }
    var PessoaInfo = "$nome e $cpf"
}