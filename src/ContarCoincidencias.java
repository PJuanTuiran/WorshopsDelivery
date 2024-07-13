import java.util.*;

public class ContarCoincidencias {

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


        Map<Integer, Integer> contador = new HashMap<>();
        for (int num : array) {
            contador.put(num, contador.getOrDefault(num, 0) + 1);
        }


        List<Map.Entry<Integer, Integer>> listaOrdenada = new ArrayList<>(contador.entrySet());
        listaOrdenada.sort((a, b) -> b.getValue().compareTo(a.getValue()));


        System.out.println("\nElementos ordenados por frecuencia:");
        for (Map.Entry<Integer, Integer> entrada : listaOrdenada) {
            System.out.println("Elemento: " + entrada.getKey() + " - Repeticiones: " + entrada.getValue());
        }


        scanner.close();
    }
}
