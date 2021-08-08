const val PI = 3.1416

fun main() {
    var dinero = 10
    println(dinero)
    dinero = 5
    println(dinero)

    val nombre = ""
    println(nombre)

    println(PI)

    val boolean = true
    val numeroLargo = 3L
    val double = 2.7182
    val float = 1.1f

    val primerValor = 20
    val segundoValor = 10
    val tercerValor = primerValor.minus(segundoValor)
    println(tercerValor)

    val apellido = "Luis"
    val seth = "Seth"
    val nombreCompleto = "Mi nombre es $seth $apellido"
    println(nombreCompleto)


    if(nombre.isNotEmpty()) println("El largo de nuestra variable nombre es ${nombre.length}")
    else println("Error, la variable está vacía")

    var mensaje:String

    mensaje = if(nombre.length > 4) "Tu nombre es largo" else if(nombre.isEmpty()) "Tu nombre está vacío" else "Tienes un nombre corto"

    println(mensaje)
}
