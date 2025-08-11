package backend.src;
import java.util.Scanner;
public class db {
    public static void main(String[] args) {
        int temperatura = 0; // Variable para almacenar la temperatura
        System.out.println("Ingrese la temperatura: ");
        Scanner scanner = new Scanner(System.in);
        temperatura = scanner.nextInt(); // Leer la temperatura ingresada por el usuario
        System.out.println("Ingrese la unidad de temperatura (C para Celsius, F para Fahrenheit): ");
        char unidad = scanner.next().charAt(0); // Leer la unidad de temperatura

        if (unidad != 'C' && unidad != 'F') {
            System.out.println("Unidad no válida. Por favor, ingrese C o F.");
            return; // Salir si la unidad es inválida
        }
        else{
            if (unidad == 'C') {
                // Convertir de Celsius a Fahrenheit
                double temperaturaF = (temperatura * 9.0 / 5.0) + 32;
                System.out.println("La temperatura en Fahrenheit es: " + temperaturaF);
            }
            else {
                // Convertir de Fahrenheit a Celsius
                double temperaturaC = (temperatura - 32) * 5.0 / 9.0;
                System.out.println("La temperatura en Celsius es: " + temperaturaC);
            }
        }
    }
}