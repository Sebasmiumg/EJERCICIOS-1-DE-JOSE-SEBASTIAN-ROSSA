import java.util.Scanner;

class NumeroImpar {
    private int numero;

    public NumeroImpar(int numero) {
        this.numero = numero;
    }

    public void imprimirImpares() {
        System.out.println("Números impares desde 1 hasta " + numero + ":");
        int i = 1;
        while (i <= numero) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
            i++;
        }
    }

    public int getNumero() {
        return numero;
    }
}

public class NumeroImparesWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Por favor, ingresa un número mayor a 10 y menor que 30: ");
            numero = scanner.nextInt();
        } while (numero <= 10 || numero >= 30);

        // Crear un objeto NumeroImpar
        NumeroImpar numeroImpar = new NumeroImpar(numero);

        // Imprimir los números impares
        numeroImpar.imprimirImpares();

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
