import java.util.Scanner; // Importar la clase Scanner para leer la entrada del usuario
public class basedata {
    public static void main(String[] args) {
        double numero = 0; // Variable para almacenar el número ingresado
        System.out.println("Ingrese un número: ");
        Scanner scanner = new Scanner(System.in);
        numero = scanner.nextInt(); // Leer el número ingresado por el usuario
        System.out.println("Ingrese un segundo número: ");
        int segundoNumero = scanner.nextInt(); // Leer el segundo número ingresado por el usuario
        System.out.println("La suma de " + numero + " y " + segundoNumero + " es: " + (numero + segundoNumero)); // Mostrar la suma de los dos números
        System.out.println("La resta de " + numero + " y " + segundoNumero + " es: " + (numero - segundoNumero)); // Mostrar la resta de los dos números
        System.out.println("La resta de " + segundoNumero + " y " + numero + " es: " + (segundoNumero - numero)); // Mostrar la resta en orden inverso
        System.out.println("La multiplicación de " + numero + " y " + segundoNumero + " es: " + (numero * segundoNumero)); // Mostrar la multiplicación de los dos números
        if (segundoNumero != 0) {
            System.out.println("La división de " + numero + " entre " + segundoNumero + " es: " + (numero / segundoNumero)); // Mostrar la división de los dos números
            System.out.println("La división de " + segundoNumero + " entre " + numero + " es: " + (segundoNumero / numero)); // Mostrar la división en orden inverso
        }
        else {System.out.println("Error: División por cero no permitida.");} // Manejar el caso de división por cero
    }
}