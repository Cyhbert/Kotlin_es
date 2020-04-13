/*
Paquetes: package my.package
imports: kotlin.text.*
 */

//Cómo toda aplicación, esta debe tener un <<Main>>

fun main() {
    //Imprimir datos por consola
    println("Hola Mundo!")
    println(sumarNumeros(5, 4))
    println(restarNumeros(6, 3))
    imprimirSuma(65, 3)
}

/*Funciones (Sí, funciones de pwtazo).
fun: es como se declara, dentro de los parentesis, debe ir el tipo
    de dato especifico y si regresará algo, hay que ponerlo a lado
    de los parentesis; Int va con mayúscula por lo que parece.
  */

fun sumarNumeros(a: Int, b: Int): Int{
    return a + b
}

/*Las funciones pueden ser represantadas en una linea
No se especifica el tipo de dato cuando es función de sola una
    linea.
 */
fun restarNumeros(a: Int, b: Int) = a - b

//Funciones con retorno 'Unit', este puede ser omitido

fun imprimirSuma(a: Int, b: Int): Unit{
    println("Suma de $a + $b = ${a + b}")
}

//Variables

fun mostrarVariables(){
    //Las variables 'val' solo se pueden ser declaradas y asignadas una vez
    val a: Int = 1 //Realmente no es necesario poner el tipo de dato.
    val b = 3 //Variable sin especificar el tipo de dato
    val c : Int //no es necesario asignar el dato de una vez
    c = 5

    //Las variables 'var' pueden ser reasignadas.
    var x = 5
    x += 1
    println(x)

    //Las 'var' son de alto nivel, es decir: Si es global, esta se puede usar en todo el codigo.
}


//Expresiones condicionales

fun buscarEsMayor(a: Int, b: Int): Int{
    if(a > b){
        return a
    } else{
        return b
    }
}

//Funcion en una misma linea
fun buscarMayorLinea(a: Int, b: Int) = if(a>b) a else b