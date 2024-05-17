import java.util.Scanner;

class ComparadorNumeros {
    private int numero1;
    private int numero2;

    public ComparadorNumeros(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public String comparar() {
        if (numero1 > numero2) {
            return "El primer número (" + numero1 + ") es mayor que el segundo número (" + numero2 + ").";
        } else if (numero2 > numero1) {
            return "El segundo número (" + numero2 + ") es mayor que el primer número (" + numero1 + ").";
        } else {
            return "Ambos números son iguales.";
        }
    }
}

public class CompararNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese el primer número
        System.out.print("Por favor, ingresa el primer número: ");
        int numero1 = scanner.nextInt();

        // Pedir al usuario que ingrese el segundo número
        System.out.print("Por favor, ingresa el segundo número: ");
        int numero2 = scanner.nextInt();

        // Crear un objeto ComparadorNumeros
        ComparadorNumeros comparador = new ComparadorNumeros(numero1, numero2);

        // Comparar los números e imprimir el resultado
        System.out.println(comparador.comparar());

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
