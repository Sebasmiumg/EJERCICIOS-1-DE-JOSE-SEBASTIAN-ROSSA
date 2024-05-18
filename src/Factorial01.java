import java.util.Scanner;

class Factorial {
    private int numero;

    public Factorial(int numero) {
        this.numero = numero;
    }

    public long calcular() {
        long resultado = 1;
        int i = 1;
        while (i <= numero) {
            resultado *= i;
            i++;
        }
        return resultado;
    }

    public int getNumero() {
        return numero;
    }
}

public class Factorial01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese un número
        System.out.print("Por favor, ingresa un número: ");
        int numero = scanner.nextInt();

        // Crear un objeto Factorial
        Factorial factorial = new Factorial(numero);

        // Calcular el factorial e imprimir el resultado
        System.out.println("El factorial de " + factorial.getNumero() + " es " + factorial.calcular());

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
