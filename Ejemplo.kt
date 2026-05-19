fun sumar(a: Int, b: Int): Int {
    return a + b
}

fun main() {
    print("Ingrese su nombre: ")
    val nombre = readLine()

    print("Ingrese el primer numero: ")
    val num1 = readLine()!!.toInt()

    print("Ingrese el segundo numero: ")
    val num2 = readLine()!!.toInt()

    val resultado = sumar(num1, num2)

    println("Hola $nombre")
    println("La suma es: $resultado")
}
