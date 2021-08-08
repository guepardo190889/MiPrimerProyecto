
fun main(args:Array<String>){
    val nombreColor = "Carmesí"

    when(nombreColor){
        "Amarillo" -> {
            println("El $nombreColor es el valor de la Alegría")
        }
        "Rojo", "Carmesí" -> println("El $nombreColor es el color de la Pasión")
        else -> println("Error, ese color no está disponible")
    }

    val code = 404

    when(code){
        in 200..209 -> println("Todo ha ido bien")
        in 400..500 -> println("Algo ha fallado")
        else -> println("Código desconocido, algo ha fallado")
    }

    val tallaDeZapatos = 42
    val mensaje = when(tallaDeZapatos) {
        41,43 -> "Tenemos disponibles"
        42,44 -> "Casi no nos quedan"
        45 -> "No tenemos disponibles"
        else -> "Solo tenemos tallas 41, 42, 43, 44 y 45"
    }

    println(mensaje)
}
