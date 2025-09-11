//Ejercicios del curso 2





//  Variables y tipos de datos básicos


fun variablesYTipos() {
    println("=== 4. Variables y tipos de datos básicos ===")
    val constante: Int = 10          // inmutable
    var mutable: Double = 3.14      // mutable
    var texto: String = "Kotlin"
    val booleano: Boolean = true
    val caracter: Char = 'A'
    println("constante = $constante, mutable = $mutable, texto = $texto, booleano = $booleano, caracter = $caracter")

    // Inferencia de tipos
    val numero = 42          // Int inferido
    val pi = 3.1415          // Double inferido
    println("numero = $numero, pi = $pi")
    println()
}

// Concatenación y String Template
fun stringTemplates() {
    println("=== 5. Concatenación y String Template ===")
    val nombre = "Denzel"
    val edad = 22
    // concatenación clásica
    val frase1 = "Nombre: " + nombre + ", Edad: " + edad
    // string template (recomendado)
    val frase2 = "Nombre: $nombre, Edad: $edad"
    val frase3 = "En 5 años ${nombre} tendrá ${edad + 5} años."
    println(frase1)
    println(frase2)
    println(frase3)
    println()
}

// Operadores matemáticos y conversión de tipos de datos
fun operadoresYConversiones() {
    println("=== 6. Operadores matemáticos y conversión de tipos ===")
    val a = 7
    val b = 3
    println("Suma: ${a + b}")
    println("Resta: ${a - b}")
    println("Multiplicación: ${a * b}")
    println("División entera (a/b): ${a / b}")        // división entera
    println("División decimal (a.toDouble()/b): ${a.toDouble() / b}")
    println("Módulo: ${a % b}")

    // conversiones
    val x: Int = 10
    val y: Double = x.toDouble()
    val z: Long = x.toLong()
    println("x=$x, y=$y (Double), z=$z (Long)")
    println()
}

// Redondeo y formateo de números
fun redondeoYFormateo() {
    println("=== 7. Redondeo y formateo de números ===")
    val numero = 3.1415926535
    println("Número original: $numero")
    println("round(numero) = ${round(numero)}")        // redondeo al entero más cercano
    println("ceil(numero) = ${ceil(numero)}")          // techo
    println("floor(numero) = ${floor(numero)}")        // piso
    // formateo con String.format (como en Java)
    println("Formateado a 2 decimales: ${"%.2f".format(numero)}")
    // formateo usando kotlin.math con BigDecimal si se necesitara precisión (ejemplo simple)
    val x = 2.34567
    println("Formateado con interpolación: ${"%.3f".format(x)}")
    println()
}

//  Estructuras de control, condición if-else y operadores
fun ifElseYOperadores() {
    println("=== 8. Estructuras de control, if-else y operadores ===")
    val nota = 85
    val resultado = if (nota >= 90) {
        "A"
    } else if (nota >= 80) {
        "B"
    } else if (nota >= 70) {
        "C"
    } else {
        "D o F"
    }
    println("Con nota $nota obtuviste: $resultado")

    // operadores lógicos
    val edad = 20
    val tieneLicencia = true
    if (edad >= 18 && tieneLicencia) {
        println("Puede conducir.")
    } else {
        println("No puede conducir.")
    }
    // operador ternario no existe; if puede usarse como expresión
    val esAdulto = if (edad >= 18) true else false
    println("esAdulto = $esAdulto")
    println()
}

// Expresión when
fun expresionWhen() {
    println("=== 9. Expresión when ===")
    val opcion = 2
    when (opcion) {
        1 -> println("Elegiste la opción 1")
        2 -> println("Elegiste la opción 2")
        3, 4 -> println("Elegiste la opción 3 o 4")
        in 5..10 -> println("Elegiste una opción entre 5 y 10")
        else -> println("Opción no valida")
    }

    // when como expresión
    val lenguaje = "Kotlin"
    val tipo = when (lenguaje) {
        "Kotlin", "Java" -> "JVM"
        "Swift", "Objective-C" -> "Apple"
        else -> "Otro"
    }
    println("$lenguaje pertenece a: $tipo")
    println()
}

//  Funciones
// - función simple
fun sumar(a: Int, b: Int): Int {
    return a + b
}
// - función con expresión
fun multiplicar(a: Int, b: Int) = a * b
// - función con valor por defecto y parámetros nombrados
fun saludar(nombre: String = "invitado", saludo: String = "Hola") {
    println("$saludo, $nombre!")
}
// - función que devuelve null si el divisor es 0
fun dividirSeguro(a: Double, b: Double): Double? {
    return if (b == 0.0) null else a / b
}

fun funcionesDemo() {
    println("=== 10. Funciones ===")
    println("Sumar 3 + 5 = ${sumar(3, 5)}")
    println("Multiplicar 4 * 6 = ${multiplicar(4, 6)}")
    saludar()
    saludar(nombre = "Denzel", saludo = "¡Buen día")
    val resultadoSeguro = dividirSeguro(10.0, 2.0)
    val resultadoInvalido = dividirSeguro(10.0, 0.0)
    println("10 / 2 = ${resultadoSeguro ?: "Operación inválida"}")
    println("10 / 0 = ${resultadoInvalido ?: "Operación inválida (null)"}")
    println()
}

// MAIN: llamar a todos los demos
fun main() {
    introduccion()
    historiaKotlin()
    holaMundo()
    variablesYTipos()
    stringTemplates()
    operadoresYConversiones()
    redondeoYFormateo()
    ifElseYOperadores()
    expresionWhen()
    funcionesDemo()

    // Ejemplo breve interactivo (si quieres descomentar para probar entrada por consola)
    // println("Ingresa un número:")
    // val line = readLine()
    // val num = line?.toIntOrNull() ?: 0
    // println("Tu número multiplicado por 2 es ${num * 2}")
}