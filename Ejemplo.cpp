#include <iostream>
using namespace std;

// Función para sumar dos números
int sumar(int a, int b) {
    return a + b;
}

int main() {
    string nombre;
    int num1, num2;

    cout << "Ingrese su nombre: ";
    cin >> nombre;

    cout << "Ingrese dos numeros: ";
    cin >> num1 >> num2;

    int resultado = sumar(num1, num2);

    cout << "Hola " << nombre << endl;
    cout << "La suma es: " << resultado << endl;

    return 0;
}
