

class Repartidor(nombre: String, edad: Int, salario: Double,var zona : Int) : Empleados(nombre, edad, salario) {



    override fun PLUS(){
        if(edad < 20 && zona == 3){
            salario += PLUS
            println(salario)
        }else{
            println(salario)
        }
    }


}