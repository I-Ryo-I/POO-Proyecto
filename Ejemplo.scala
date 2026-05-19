object Main {

  def sumar(a: Int, b: Int): Int = {
    a + b
  }

  def main(args: Array[String]): Unit = {

    print("Ingrese su nombre: ")
    val nombre = scala.io.StdIn.readLine()

    print("Ingrese el primer numero: ")
    val num1 = scala.io.StdIn.readInt()

    print("Ingrese el segundo numero: ")
    val num2 = scala.io.StdIn.readInt()

    val resultado = sumar(num1, num2)

    println(s"Hola $nombre")
    println(s"La suma es: $resultado")
  }
}
