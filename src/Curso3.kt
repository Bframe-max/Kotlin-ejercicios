//curso #3

fun main() {
    aplicacionDatos()
    variablesValoresConstantes()
    tiposDeDatos()
    operadoresCalculo()
}



fun aplicacionDatos() {
    println("=== . Aplicación real del uso de datos ===")
    val nombre = "Denzel"
    val edad = 22
    println("Ejemplo: Hola, soy $nombre y tengo $edad años.")
    println("Un app real puede usar estos datos para registrarte o personalizar tu experiencia.")
    println()
}


fun variablesValoresConstantes() {
    println("=== . Variables, Valores y Constantes ===")
    var variable = 10        // mutable
    val valor = 20           // inmutable (solo lectura)
    val constante: Double = 3.1416  // valor fijo

    println("Variable inicial: $variable")
    variable = 15
    println("Variable modificada: $variable")
    println("Valor fijo (val): $valor")
    println("Constante: $constante")
    println()
}


//  Tipos de Datos y sus ámbitos
fun tiposDeDatos() {
    println("=== 6. Tipos de Datos y sus ámbitos ===")

    // Tipos básicos
    val entero: Int = 42
    val decimal: Double = 3.14
    val flotante: Float = 2.71f
    val caracter: Char = 'A'
    val texto: String = "Hola Kotlin"
    val booleano: Boolean = true

    println("Entero: $entero")
    println("Decimal: $decimal")
    println("Flotante: $flotante")
    println("Caracter: $caracter")
    println("Texto: $texto")
    println("Booleano: $booleano")

    // Ámbito (scope)
    val global = "Estoy en main"
    fun funcionInterna() {
        val local = "Solo vivo dentro de funcionInterna"
        println(global)
        println(local)
    }
    funcionInterna()
    println()
}

// . Operadores de Cálculo
fun operadoresCalculo() {
    println("=== . Operadores de Cálculo ===")
    val a = 12
    val b = 5

    println("Suma: $a + $b = ${a + b}")
    println("Resta: $a - $b = ${a - b}")
    println("Multiplicación: $a * $b = ${a * b}")
    println("División: $a / $b = ${a / b}")   // entero
    println("División decimal: ${a.toDouble() / b}")
    println("Módulo (residuo): $a % $b = ${a % b}")

    // Ejemplo: calcular promedio
    val promedio = (a + b) / 2.0
    println("Promedio de $a y $b = $promedio")
    println()
}
