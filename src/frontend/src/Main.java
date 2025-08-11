package frontend.src;

public class Main {
    public static void main(String[] args) {
        Style style = new Style();
        style.name = "Juan"; // Asignar un nombre al estilo
        style.apellido = "Prada"; // Asignar un apellido al estilo
        System.out.println("El tu nombre es: " + style.name); // Imprimir el nombre del estilo
        System.out.println("Tu apellido es: " + style.apellido); // Imprimir el apellido del estilo
    }
}
