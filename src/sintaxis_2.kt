import java.lang.Integer.parseInt

fun main() {
    hacerCicloFor()
    hacerWhile()
    println(saludarRegion("mexico"))
    mostrarRangos()
    mostrarColecciones()
    println("Multiplicación: ${verificarYMultiplicar(5, 6)}")
}

//Podemos crear referencias cuando haya un posible valor Null

fun parsearInt(str: String): Int? {
    return null
}

fun printProduct(arg1: String, arg2: String) {
    val x = parseInt(arg1)
    val y = parseInt(arg2)


    if (x != null && y != null) {
        // x and y are automatically cast to non-nullable after null check
        println(x * y)
    } else {
        println("'$arg1' or '$arg2' is not a number")
    }
}

//Evaluar datos con is

fun saberTamañoString(objt: Any): Int? {
    //estamos preguntado si el dato es 'String' para evitar caer en errores
    if (objt is String) {
        return objt.length //No lleva parentesis .lenght
    } else {
        return null
    }
}

//Multiplicar numeros con verificacion de datos

fun verificarYMultiplicar(a: Int, b: Int): Int? {
    if (a is Int && a is Int) {
        return a * b
    } else {
        return null
    }
}

//Ciclo FOR

fun hacerCicloFor() {
    val frutas = listOf("apple", "banana", "orange")
    for (fruta in frutas) {
        println(fruta)
    }
}

//WHILE

fun hacerWhile() {
    val frutas2 = listOf("pera", "kiwi", "cereza")
    var indexFrutas = 0
    while (indexFrutas < frutas2.size) {
        println("jajaja xdd")
        indexFrutas++
    }
}

//WHEN (el switch de Kotlin)

fun saludarRegion(objt: Any): String =
    when (objt){
        "mexico" -> "Hola guey"
        "españa" -> "Hola tio xdxd"
        else -> "no se donde eres"
    }

//Rangos (esto es buenisimo)

fun mostrarRangos(){
    for(x in 1..10 step 1){
        println(x)
    }
    //Le decis cuantos pasos se salte
    for(y in 1..20 step 2){
        println(y)
    }
}

//Colleciones

fun mostrarColecciones() {
    val autosLista = listOf("jaguar", "Honda", "hyundai")
    for (auto in autosLista){
        println(auto)
    }
    when{
        "jaguar" in autosLista -> println("jaguar")
    }

    val x : String = 25.toString()
    val ahre = listOf<String>("xd")
    println(ahre.size)
    // Array of int of size 5 with values [0, 0, 0, 0, 0]
    val arr = IntArray(5)

    // e.g. initialise the values in the array with a constant
    // Array of int of size 5 with values [42, 42, 42, 42, 42]
    val arr2 = IntArray(5) { 42 }
    arr.plus(3)
    // e.g. initialise the values in the array using a lambda
    // Array of int of size 5 with values [0, 1, 2, 3, 4] (values initialised to their index value)
    var arr3 = IntArray(5) { it * 1 }
}