import java.util.Scanner;

public class FacturacionTienda {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] productos = {"Manzanas", "Naranjas", "Plátanos", "Peras", "Uvas"};

        double[] precios = {0.50, 0.60, 0.30, 0.40, 1.00};

        int[] cantidades = new int[productos.length];

        System.out.println("Bienvenido a la tienda. A continuación, se muestra la lista de productos y sus precios:");


        for (int i = 0; i < productos.length; i++) {
            System.out.println((i + 1) + ". " + productos[i] + " - $" + precios[i] + " por unidad");
        }


        for (int i = 0; i < productos.length; i++) {
            System.out.print("Ingrese la cantidad de " + productos[i] + " que desea comprar: ");
            cantidades[i] = scanner.nextInt();
        }


        double totalFactura = 0;
        System.out.println("\nFactura:");
        for (int i = 0; i < productos.length; i++) {
            double subtotal = cantidades[i] * precios[i];
            if (cantidades[i] > 0) {
                System.out.println(productos[i] + " - Cantidad: " + cantidades[i] + " - Subtotal: $" + subtotal);
            }
            totalFactura += subtotal;
        }


        System.out.println("\nTotal de la factura: $" + totalFactura);


        scanner.close();
    }
}
