fun main(args:Array<String>){
    var contador = 10

    while(contador > 0) {
        println("El valor de contador es $contador")
        contador--
    }

    do {
        println("Generando número aleatorio...")
        val numeroAleatorio = (0..100).random()

        println("El número generado es $numeroAleatorio")
    }while(numeroAleatorio > 50)

    val listaDeFrutas = listOf<String>("Manzana", "Pera", "Frambuesa", "Durazno")

    println(listaDeFrutas)

    for(fruta in listaDeFrutas) println("Hoy voy a comerme una fruta llamada $fruta")

    listaDeFrutas.forEach {fruta -> println("Hoy voy a comerme una fruta llamada $fruta") }

    val caracteresDeFrutas: List<Int> = listaDeFrutas.map { fruta -> fruta.length }

    println("Lista de caracteres de frutas: $caracteresDeFrutas")

    val listaFiltrada = caracteresDeFrutas.filter { largoDeFruta -> largoDeFruta > 5 }

    println(listaFiltrada)

}