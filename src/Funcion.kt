/* el uso de funciones en kotlin es sencillo solo se declara la palabra reselvada fun,
no es necesario definir que la funciones retorne un valor, pero si uno necesita retornar
un valor, kotlin lo puede hacer
 */

// funciones estandar  (normales)

fun saludar(){
    println(" Hola como esta")
}

// funciones que reciben parametros
fun saludar2(nombre: String){
    println("Hola, $nombre")
}

// funciones que reciben parametros y devuelve valor (puede devolver valores:
// String, Int, Double, etc

fun division (num1: Double, num2: Double): Double{
    return num1 / num2
}

//funciones de una sola expresion
// Si la función tiene una sola instrucción, puedes simplificarla con =.
fun cuadrado(x: Int): Int = x * x

fun main(){
    saludar2("Denzel")
    division(2.0,4.0)
    // funciones lamda (es casi igual a la funcion flecha de javaScript)
    // Lambda que suma dos números
    val sumar: (Int, Int) -> Int = { a, b -> a + b }
    println(sumar(5, 3))
}