package one.dio.digionebank.teste

import one.dio.digionebank.Gerente

    fun main(){
        val gerente01 = Gerente("Seu fulano","14714714714",5000.0,"senha153")
        gerente01.imprimeDados()
        TesteAutenticacao().autentica(gerente01)
    }

