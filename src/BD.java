import java.util.Scanner;
public class BD {
    public static void main(String[] args) {
        double resultado = 0; // Variable para almacenar el resultado de la operación
        do{
            System.out.println("\t Bienvenido a la calculadora de operaciones básicas.");
            System.out.println("Ingresa el primer numreo: ");
            Scanner scanner = new Scanner(System.in);
            int numero1 = scanner.nextInt(); // Leer el primer número ingresado por el usuario
            System.out.println("Ingresa el segundo número: ");
            int numero2 = scanner.nextInt(); // Leer el segundo número ingresado por el usuario
            System.out.println("Ingresa la operación a realizar (+, -, *, /): ");
            char operacion = scanner.next().charAt(0); // Leer la operación a realizar

            switch (operacion) {
                case '+':
                    resultado = numero1 + numero2; // Sumar
                    System.out.println("El resultado de la suma es: " + resultado);
                    break;
                case '-':
                    resultado = numero1 - numero2; // Restar
                    System.out.println("El resultado de la resta es: " + resultado);
                    resultado = numero2 - numero1; // Restar en orden inverso
                    System.out.println("El resultado de la resta en orden inverso es: " + resultado);
                    break;
                case '*':
                    resultado = numero1 * numero2; // Multiplicar
                    System.out.println("El resultado de la multiplicación es: " + resultado);
                    break;
                case '/':
                    if (numero2 != 0) {
                        resultado = numero1 / numero2; // Dividir
                        System.out.println("El resultado de la división es: " + resultado);
                        resultado = numero2 / numero1; // Dividir en orden inverso
                        System.out.println("El resultado de la división en orden inverso es: " + resultado);
                    }
                    else {System.out.println("Error: División por cero no permitida.");}
                    break;
                default:
                    System.out.println("Operación no válida. Por favor, ingrese una operación válida.");
        }
    }
    while (resultado != 0); // Repetir hasta que el resultado sea cero
        System.out.println("Gracias por usar la calculadora. ¡Hasta luego!");
    }
}