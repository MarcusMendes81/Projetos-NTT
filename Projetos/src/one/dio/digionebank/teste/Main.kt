package one.dio.digionebank



fun main(){
   val cliente = Pessoa()
    println(cliente.PessoaInfo)
    println(cliente.endereco().rua+" "+" nº: "+cliente.endereco().numero)
    println(cliente.endereco().bairro)
}