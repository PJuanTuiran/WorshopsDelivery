import java.util.Scanner;

public class BusquedaEnArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] nombres = {"Carlos", "Ana", "Pedro", "María", "Luis", "Sofía", "Juan"};

        System.out.print("Ingrese un nombre a buscar: ");
        String nombreBuscado = scanner.nextLine();


        boolean encontrado = false;
        for (int i = 0; i < nombres.length; i++) {
            if (nombres[i].equalsIgnoreCase(nombreBuscado)) {
                System.out.println("Nombre encontrado en la posición: " + i);
                encontrado = true;
                break;
            }
        }


        if (!encontrado) {
            System.out.println("El nombre no se encuentra en el array.");
        }


        scanner.close();
    }
}
