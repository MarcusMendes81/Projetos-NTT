package one.dio.digionebank.teste

import one.dio.digionebank.ClienteTipo

fun main(){
    // classe enum
    val pf = ClienteTipo.PF
    val pj = ClienteTipo.PJ
    println(pf.name+": "+pf.descricao)
    println(pj.name+": "+pj.descricao)
}