import java.util.Scanner;

public class BuscaPalabras {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Ingrese un texto: ");
        String texto = scanner.nextLine();


        System.out.print("Ingrese la palabra a buscar: ");
        String palabra = scanner.nextLine();


        String textoMinusculas = texto.toLowerCase();
        String palabraMinusculas = palabra.toLowerCase();


        int indice = textoMinusculas.indexOf(palabraMinusculas);
        boolean encontrada = false;

        while (indice != -1) {
            encontrada = true;
            int finIndice = indice + palabra.length() - 1;
            System.out.println("Palabra encontrada desde la posición " + indice + " hasta " + finIndice);
            indice = textoMinusculas.indexOf(palabraMinusculas, indice + 1);
        }

        if (!encontrada) {
            System.out.println("La palabra no se encontró en el texto.");
        }


        scanner.close();
    }
}
