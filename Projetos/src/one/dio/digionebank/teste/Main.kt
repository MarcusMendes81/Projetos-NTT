package one.dio.digionebank



fun main(){
   val cliente = Pessoa()

    // interpoalação
    println(cliente.PessoaInfo)

    //Inner class, classe dentro de outra classe
    println(cliente.endereco().rua+" "+" nº: "+cliente.endereco().numero)
    println(cliente.endereco().bairro)

    // classe data
    val bank = Banco("DigiOneBank",12)
    println(bank.Info())

}