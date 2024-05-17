import java.util.Scanner;

class Persona {
    private int edad;

    public Persona(int edad) {
        this.edad = edad;
    }

    public boolean esMayorDeEdad() {
        return edad >= 18;
    }

    public int getEdad() {
        return edad;
    }
}

public class MayorDeEdad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese su edad
        System.out.print("Por favor, ingresa tu edad: ");
        int edad = scanner.nextInt();

        // Crear un objeto Persona
        Persona persona = new Persona(edad);

        // Determinar si el usuario es mayor de edad
        if (persona.esMayorDeEdad()) {
            System.out.println("Eres mayor de edad.");
        } else {
            System.out.println("No eres mayor de edad.");
        }

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
