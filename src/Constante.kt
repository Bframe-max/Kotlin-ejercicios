// este tipo de variable se puede usar en cualquier parte del codigo
// ya sea funciones o main (se el conoce tambien como variable globales)
const val Num = 50
const val Num2 = 4

fun multiplicar(){
    var result = Num*Num2
    println("el resultado es: $result")
}

fun main(){
    multiplicar()
}