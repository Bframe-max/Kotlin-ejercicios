fun main() {
    // Números enteros (Int)
    val edad: Int = 25
    println("Edad: $edad")

    // Números decimales (Float y Double)
    val altura: Float = 1.75f  // Float necesita la "f"
    val peso: Double = 70.5    // Double por defecto
    println("Altura: $altura m, Peso: $peso kg")

    // Caracteres y Cadenas
    val inicial: Char = 'J'
    val nombre: String = "Joel"
    println("Inicial: $inicial, Nombre: $nombre")

    // Booleanos
    val esMayor: Boolean = edad >= 18
    println("¿Es mayor de edad? $esMayor")

    // Conversiones de tipo
    val numero: Int = 10
    val numeroDouble: Double = numero.toDouble()  // convertir Int → Double
    println("Número Int: $numero, convertido a Double: $numeroDouble")

    // Arrays de tipo primitivo
    val numeros: IntArray = intArrayOf(1, 2, 3, 4, 5)
    println("Array de enteros: ${numeros.joinToString()}")
}