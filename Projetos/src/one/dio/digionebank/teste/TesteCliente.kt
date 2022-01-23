package one.dio.digionebank.teste

import one.dio.digionebank.Cliente
import one.dio.digionebank.ClienteTipo

fun main(){
    val cliente01 = Cliente("Carlos","12378915212",ClienteTipo.PF,"123456")
    cliente01.imprimeDados()
    TesteAutenticacao().autentica(cliente01)
}