import java.util.Scanner;

public class InvertirArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Ingrese el tamaño del array: ");
        int n = scanner.nextInt();


        int[] array = new int[n];


        System.out.println("Ingrese los elementos del array:");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemento [" + i + "]: ");
            array[i] = scanner.nextInt();
        }


        System.out.println("\nArray original:");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();


        for (int i = 0; i < n / 2; i++) {
            int temp = array[i];
            array[i] = array[n - 1 - i];
            array[n - 1 - i] = temp;
        }


        System.out.println("\nArray invertido:");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();


        scanner.close();
    }
}
