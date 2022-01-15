
import java.util.Scanner

fun main(){
    val input = Scanner(System.`in`)

    print("=== Calculadora Kotlin ===\n")

    print("Insira o 1º valor: ")
    val n1 = input.nextDouble()
    print("Insira o 2º valor: ")
    val n2 = input.nextDouble()


    println("Digite 1 para somar")
    println("Digite 2 para subtrair")
    println("Digite 3 para multiplicar")
    println("Digite 4 para dividir")
    val operacao = input.nextInt()


    when(operacao){

        1 -> println("$n1 + $n2 = "+soma(n1,n2))
        2 -> println("$n1 - $n2 = "+subtracao(n1,n2))
        3 -> println("$n1 x $n2 = "+multiplicacao(n1,n2))
        4 -> println("$n1 / $n2 = "+divisao(n1, n2))
        else -> println("Opção inválida !")
    }

}

fun soma(n1:Double, n2:Double):Double{return n1+n2}
fun subtracao(n1:Double, n2:Double):Double{return n1-n2}
fun multiplicacao(n1:Double, n2:Double):Double{return n1*n2}
fun divisao(n1:Double, n2:Double):Double{return n1/n2}
