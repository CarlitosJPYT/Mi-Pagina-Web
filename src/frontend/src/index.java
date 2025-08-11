package frontend.src;
import java.util.Scanner;
public class index {
    public static void main(String[] args) {
        int saldo = 1000; // Saldo inicial
        int opcion = 0; // Variable para almacenar la opción del usuario

        do {
            System.out.println("\n\t Bienvenido a su cajero virtual.");
            System.out.println("Seleccione una de las siguientes opciones:");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Retirar dinero");
            System.out.println("3. Depositar dinero");
            System.out.println("4. Salir");
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ingrese su opción: ");
            opcion = scanner.nextInt(); // Leer la opción del usuario

            if (opcion < 1 || opcion > 4) {
                System.out.println("Opción no válida. Por favor, intente de nuevo.");
                continue; // Volver al inicio del bucle si la opción es inválida
            }

            switch (opcion) {
                case 1:
                    int saldoActual = saldo; // Consultar saldo
                    System.out.println("Su saldo actual es: " + saldoActual);
                    break;
                case 2:
                    System.out.print("Ingrese la cantidad a retirar: ");
                    int cantidadRetirar = scanner.nextInt();
                    if (cantidadRetirar <= saldo) {
                        saldo -= cantidadRetirar; // Retirar dinero
                        System.out.println("Retiro exitoso. Su nuevo saldo es: " + saldo);
                    }
                    else {System.out.println("Saldo insuficiente.");}
                    break;
                case 3:
                    System.out.print("Ingrese la cantidad a depositar: ");
                    int cantidadDepositar = scanner.nextInt();
                    saldo += cantidadDepositar; // Depositar dinero
                    System.out.println("Depósito exitoso. Su nuevo saldo es: " + saldo);
                    break;
                case 4:
                    System.out.println("Gracias por usar el cajero virtual. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
                    // No se espera que llegue aquí debido a la validación anterior
                    break;
            }
        } while (opcion != 4); // Repetir hasta que el usuario elija salir
    }
}