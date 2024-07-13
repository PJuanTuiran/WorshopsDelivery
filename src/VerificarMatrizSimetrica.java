import java.util.Scanner;

public class VerificarMatrizSimetrica {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Ingrese el tamaño de la matriz cuadrada (n x n): ");
        int n = scanner.nextInt();


        int[][] matriz = new int[n][n];


        System.out.println("Ingrese los elementos de la matriz:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }


        System.out.println("\nMatriz original:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }


        boolean esSimetrica = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] != matriz[j][i]) {
                    esSimetrica = false;
                    break;
                }
            }
            if (!esSimetrica) {
                break;
            }
        }


        if (esSimetrica) {
            System.out.println("\nLa matriz es simétrica.");
        } else {
            System.out.println("\nLa matriz no es simétrica.");
        }

        scanner.close();
    }
}
