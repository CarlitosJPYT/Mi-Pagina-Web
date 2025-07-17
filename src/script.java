public class script {
    public static void main(String[] args) {
        suma(6, 8, 0); // Llamar al método suma con dos números
        resta(6, 8, 0); // Llamar al método resta con dos números
        multiplicación(6, 8, 0); // Llamar al método multiplicación con dos números
        división(6, 8, 0); // Llamar al método división con dos números
    }
    static void suma(int numero1, int numero2, int resultado) {
        resultado = numero1 + numero2; // Sumar los dos números
        System.out.println("La suma de " + numero1 + " y " + numero2 + "es: " + resultado);
    }
    static void resta(int numero1, int numero2, int resultado) {
        resultado = numero1 - numero2; // Restar los dos números
        System.out.println("La resta de " + numero1 + " y " + numero2 + " es: " + resultado);
        resultado = numero2 - numero1; // Restar en orden inverso
        System.out.println("La resta de " + numero2 + " y " + numero1 + " es: " + resultado);
    }
    static void multiplicación(int numero1, int numero2, int resultado) {
        resultado = numero1 * numero2; // Multiplicar los dos números
        System.out.println("La multiplicacion de " + numero1 + " y " + numero2 + " es: " + resultado);
    }
    static void división(double numero1, double numero2, double resultado) {
        if (numero2 != 0) {
            resultado = numero1 / numero2; // Dividir los dos números
            System.out.println("La división de " + numero1 + " entre " + numero2 + " es: " + resultado);
            resultado = numero2 / numero1; // Dividir en orden inverso
            System.out.println("La división de " + numero2 + " entre " + numero1 + " es: " + resultado);
        }
        else {System.out.println("Error: División por cero no permitida.");} // Manejar el caso de división por cero
    }
}
