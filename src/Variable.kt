fun Variable(){
    val nombre = "Denzel"
    println(nombre)


    var persona = "Denzel Tiffer"
    persona = "Joel"

    println(persona)


    // ejemplo de como se puede declarar variable segun el tipo de dato
    val texto:String
    val entero: Int
    val decimal1:Double
    val decimal2: Float
    val boleano : Boolean
    val caracter : Char


}

fun main() {
    Variable()

    /*
En Kotlin existen dos formas de declarar variables: var y val.

- var (mutable):
Se utiliza cuando necesitamos que el valor de la variable pueda cambiar
a lo largo del programa. Es decir, permite reasignar un nuevo valor.
Ejemplo:
   var edad = 20
   edad = 21   // permitido

- val (inmutable / solo lectura):
Se utiliza cuando el valor solo se puede asignar una vez.
No permite reasignar la variable, pero si almacena un objeto mutable,
es posible modificar el contenido de ese objeto.
Ejemplo:
   val nombre = "Joel"
   nombre = "Denzel"   // error, no se puede reasignar

   val lista = mutableListOf(1, 2, 3)
   lista.add(4)  // permitido, el objeto sí puede cambiar

En resumen:
- var → variable mutable (puede cambiar su valor).
- val → variable inmutable (no puede reasignarse, pero su contenido puede mutar


 */

}