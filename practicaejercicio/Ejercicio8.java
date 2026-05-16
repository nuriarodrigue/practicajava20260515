import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.print("Ingrese el tercer número: ");
        double num3 = scanner.nextDouble();

        double mayor = num1; // Asumimos inicialmente que el primero es el mayor

        // Evaluamos las demás posibilidades con IF
        if (num2 > mayor) {
            mayor = num2;
        }
        if (num3 > mayor) {
            mayor = num3;
        }

        System.out.println("El número mayor de los tres ingresados es: " + mayor);

        scanner.close();
    }
}