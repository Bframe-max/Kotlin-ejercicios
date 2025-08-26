fun main() {
    // Condicional if
    val edad = 20
    if (edad >= 18) {
        println("Eres mayor de edad")
    } else {
        println("Eres menor de edad")
    }

    // Condicional when
    val dia = 3
    when (dia) {
        1 -> println("Lunes")
        2 -> println("Martes")
        3 -> println("Miércoles")
        4 -> println("Jueves")
        5 -> println("Viernes")
        else -> println("Fin de semana")
    }

    // Bucle for
    for (i in 1..5) {
        println("Número en for: $i")
    }

    // Bucle while
    var contador = 3
    while (contador > 0) {
        println("While → Contador: $contador")
        contador--
    }

    // Bucle do while
    var numero = 1
    do {
        println("Do While → Número: $numero")
        numero++
    } while (numero <= 3)

    // Labels con continue y break
    loopExterno@ for (i in 1..3) {
        for (j in 1..3) {
            if (i == 2 && j == 2) {
                println("Salto con continue en i=$i, j=$j")
                continue@loopExterno
            }
            if (i == 3 && j == 3) {
                println("Rompo todo con break en i=$i, j=$j")
                break@loopExterno
            }
            println("i=$i, j=$j")
        }
    }
}
