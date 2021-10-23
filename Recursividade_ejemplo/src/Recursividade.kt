import java.util.*

fun main (args: Array<String>) {

    val teclado = Scanner(System.`in`)

    fun cuentaregresiva(numero: Int): Int  {
        if (numero == 0) {
            return 0
        } else {
            println(numero)
            return cuentaregresiva(numero-1)
        }
    }
    println("Digite um numero: ")
    cuentaregresiva(teclado.nextInt())
}
