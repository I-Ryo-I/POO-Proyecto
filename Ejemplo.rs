use std::io;

// Función para sumar
fn sumar(a: i32, b: i32) -> i32 {
    a + b
}

fn main() {

    let mut nombre = String::new();

    println!("Ingrese su nombre:");
    io::stdin()
        .read_line(&mut nombre)
        .expect("Error al leer");

    let mut num1 = String::new();
    let mut num2 = String::new();

    println!("Ingrese el primer numero:");
    io::stdin().read_line(&mut num1).expect("Error");

    println!("Ingrese el segundo numero:");
    io::stdin().read_line(&mut num2).expect("Error");

    let n1: i32 = num1.trim().parse().expect("Numero invalido");
    let n2: i32 = num2.trim().parse().expect("Numero invalido");

    let resultado = sumar(n1, n2);

    println!("Hola {}", nombre.trim());
    println!("La suma es: {}", resultado);
}
