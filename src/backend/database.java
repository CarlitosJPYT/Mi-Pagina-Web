package backend;
import java.util.Scanner;
public class database {
    public static void main(String[] args) {
        int edad = 0; // Variable para almacenar la edad
        System.out.println("Ingrese su edad: ");
        Scanner scanner = new Scanner(System.in);
        edad = scanner.nextInt(); // Leer la edad ingresada por el usuario
        if (edad < 0) {System.out.println("Edad no válida. Por favor, ingrese una edad positiva.");}
        else if (edad < 5) {System.out.println("Usted es un bebé.");}
        else if (edad > 4 && edad < 12) {System.out.println("Usted es niño.");}
        else if (edad > 11 && edad < 18) {System.out.println("Usted es un adolescente.");}
        else if (edad > 17 && edad < 50) {System.out.println("Usted es un adulto.");}
        else {System.out.println("Usted es un adulto mayor.");} // Edad 60 o más
    }
}