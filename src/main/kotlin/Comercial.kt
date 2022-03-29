

class Comercial(nombre: String, edad: Int, salario: Double, var comision : Double) : Empleados(nombre, edad, salario) {



    override  fun PLUS(){

        if(edad >= 30 && comision > 200.0){
            salario += PLUS

            println(salario)
        }else{
            println(salario)
        }

    }
}