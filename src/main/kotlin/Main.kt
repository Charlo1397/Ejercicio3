fun main(args: Array<String>) {
    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    //println("Program arguments: ${args.joinToString()}")


    val eComercial = Comercial("Carlos",24,200.0,200.0)
    val eComercial2 = Comercial("Justin",32,300.0,300.0)

    val eRepartidor = Repartidor("Maycol",17,300.0,3)
    val eRepartidor2 = Repartidor("Aaron",23,200.0, 5)


    println("Salario de empleados Comerciales:")
    eComercial2.PLUS()
    eComercial.PLUS()
    println("Salario de empleados Repartidores:")
    eRepartidor.PLUS()
    eRepartidor2.PLUS()






}