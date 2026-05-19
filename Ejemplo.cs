using System;

class Program
{
    static int Sumar(int a, int b)
    {
        return a + b;
    }

    static void Main()
    {
        Console.Write("Ingrese su nombre: ");
        string nombre = Console.ReadLine();

        Console.Write("Ingrese dos numeros: ");
        int num1 = int.Parse(Console.ReadLine());
        int num2 = int.Parse(Console.ReadLine());

        int resultado = Sumar(num1, num2);

        Console.WriteLine($"Hola {nombre}");
        Console.WriteLine($"La suma es: {resultado}");
    }
}
