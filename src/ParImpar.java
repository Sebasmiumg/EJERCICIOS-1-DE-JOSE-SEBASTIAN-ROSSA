import java.util.Scanner;

class Numero {
    private int valor;

    public Numero(int valor) {
        this.valor = valor;
    }

    public boolean esPar() {
        return valor % 2 == 0;
    }

    public int getValor() {
        return valor;
    }
}

public class ParImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese un número entero
        System.out.print("Por favor, ingresa un número entero: ");
        int numero = scanner.nextInt();

        // Crear un objeto Numero
        Numero num = new Numero(numero);

        // Determinar si el número es par o impar
        if (num.esPar()) {
            System.out.println("El número " + num.getValor() + " es par.");
        } else {
            System.out.println("El número " + num.getValor() + " es impar.");
        }

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
