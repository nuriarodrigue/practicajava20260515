import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor total de la compra: $");
        double compra = scanner.nextDouble();

        double porcentajeDescuento = 0.0;

        // Estructura if-else para determinar las escalas de descuento
        if (compra < 100) {
            porcentajeDescuento = 0.0;
        } else if (compra >= 100 && compra <= 300) {
            porcentajeDescuento = 0.10; // 10%
        } else if (compra > 300) {
            porcentajeDescuento = 0.15; // 15%
        }

        double descuentoAplicado = compra * porcentajeDescuento;
        double montoAPagar = compra - descuentoAplicado;

        System.out.println("Descuento a aplicar (" + (porcentajeDescuento * 100) + "%): $" + descuentoAplicado);
        System.out.println("Monto final a pagar: $" + montoAPagar);

        scanner.close();
    }
}
