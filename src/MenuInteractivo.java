import java.util.Scanner;

public class MenuInteractivo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        double num1, num2, resultado;

        do {
            System.out.println("Menú Interactivo:");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Salir");
            System.out.print("Elija una opción: ");
            opcion = scanner.nextInt();

            if (opcion >= 1 && opcion <= 4) {
                System.out.print("Ingrese el primer número: ");
                num1 = scanner.nextDouble();
                System.out.print("Ingrese el segundo número: ");
                num2 = scanner.nextDouble();

                switch (opcion) {
                    case 1:
                        resultado = num1 + num2;
                        System.out.println("Resultado de la suma: " + resultado);
                        break;
                    case 2:
                        resultado = num1 - num2;
                        System.out.println("Resultado de la resta: " + resultado);
                        break;
                    case 3:
                        resultado = num1 * num2;
                        System.out.println("Resultado de la multiplicación: " + resultado);
                        break;
                    case 4:
                        if (num2 != 0) {
                            resultado = num1 / num2;
                            System.out.println("Resultado de la división: " + resultado);
                        } else {
                            System.out.println("Error: División por cero no permitida.");
                        }
                        break;
                }
            } else if (opcion != 5) {
                System.out.println("Opción no válida. Por favor, elija una opción del 1 al 5.");
            }

        } while (opcion != 5);

        System.out.println("Gracias por usar el programa. ¡Hasta luego!");
        scanner.close();
    }
}
