import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la nota 1 (0-10): ");
        double nota1 = scanner.nextDouble();

        System.out.print("Ingrese la nota 2 (0-10): ");
        double nota2 = scanner.nextDouble();

        System.out.print("Ingrese la nota 3 (0-10): ");
        double nota3 = scanner.nextDouble();

        // Validación usando operadores lógicos &&
        if (nota1 >= 0 && nota1 <= 10 && nota2 >= 0 && nota2 <= 10 && nota3 >= 0 && nota3 <= 10) {

            double promedio = (nota1 + nota2 + nota3) / 3;
            System.out.println("El promedio obtenido es: " + promedio);

            if (promedio >= 6.0) {
                System.out.println("Estado: APROBADO");
            } else {
                System.out.println("Estado: REPROBADO");
            }

        } else {
            System.out.println("Error: Una o más notas están fuera del rango permitido (0 a 10).");
        }

        scanner.close();
    }
}