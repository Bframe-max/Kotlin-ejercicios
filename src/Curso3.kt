// =========================
// EJERCICIO CURSO 3
// Estructuras de Control + Programación Modular
// =========================

fun main() {
    println("===== EJERCICIO CURSO 3: ESTRUCTURAS DE CONTROL Y PROGRAMACIÓN MODULAR =====\n")

    // Llamamos a las funciones (módulos)
    mostrarIntroduccion()

    // Ejemplo con IF-ELSE
    verificarEdad(17)
    verificarEdad(25)

    // Ejemplo con WHEN
    mostrarDiaDeLaSemana(2)
    mostrarDiaDeLaSemana(6)

    // Ejemplo con FOR
    imprimirNumerosDel1Al5()

    // Ejemplo con WHILE
    contarHasta(4)

    // Ejemplo con FOR + IF
    imprimirParesEImpares(7)

    // Ejemplo con WHEN + rangos
    evaluarCalificacion(92)
    evaluarCalificacion(60)

    println("\n===== FIN DEL EJERCICIO CURSO 3 =====")
}

// ====== MÓDULOS (FUNCIONES) ======

// Módulo de introducción
fun mostrarIntroduccion() {
    println("Este es un ejemplo del Curso 3.")
    println("Aquí aplicamos las estructuras de control en funciones modulares.\n")
}

// Módulo con IF-ELSE
fun verificarEdad(edad: Int) {
    println("== Verificar Edad ($edad años) ==")
    if (edad >= 18) {
        println("La persona es mayor de edad ✅")
    } else {
        println("La persona es menor de edad ❌")
    }
    println()
}

// Módulo con WHEN
fun mostrarDiaDeLaSemana(dia: Int) {
    println("== Mostrar Día de la Semana ==")
    when (dia) {
        1 -> println("Lunes")
        2 -> println("Martes")
        3 -> println("Miércoles")
        4 -> println("Jueves")
        5 -> println("Viernes")
        6 -> println("Sábado")
        7 -> println("Domingo")
        else -> println("Número de día inválido")
    }
    println()
}

// Módulo con FOR
fun imprimirNumerosDel1Al5() {
    println("== Números del 1 al 5 con FOR ==")
    for (i in 1..5) {
        println("Número: $i")
    }
    println()
}

// Módulo con WHILE
fun contarHasta(limite: Int) {
    println("== Contar hasta $limite con WHILE ==")
    var contador = 1
    while (contador <= limite) {
        println("Contador: $contador")
        contador++
    }
    println()
}

// Módulo con FOR + IF
fun imprimirParesEImpares(limite: Int) {
    println("== Números pares e impares hasta $limite ==")
    for (i in 1..limite) {
        if (i % 2 == 0) {
            println("$i es par")
        } else {
            println("$i es impar")
        }
    }
    println()
}

// Módulo con WHEN y rangos
fun evaluarCalificacion(calificacion: Int) {
    println("== Evaluar Calificación ($calificacion) ==")
    when (calificacion) {
        in 90..100 -> println("Sobresaliente 🎉")
        in 70..89 -> println("Bueno 👍")
        in 0..69 -> println("Necesita mejorar ❌")
        else -> println("Valor inválido")
    }
    println()
}
