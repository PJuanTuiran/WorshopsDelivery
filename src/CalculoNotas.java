import java.util.Scanner;

public class CalculoNotas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        final int TOTAL_NOTAS = 8;
        final double NOTA_MINIMA_APROBACION = 76.0;


        System.out.print("Ingrese la cantidad de calificaciones ya obtenidas: ");
        int numCalificacionesObtenidas = scanner.nextInt();


        if (numCalificacionesObtenidas > TOTAL_NOTAS) {
            System.out.println("Error: El número de calificaciones obtenidas no puede ser mayor que " + TOTAL_NOTAS);
            return;
        }



        double[] calificaciones = new double[numCalificacionesObtenidas];
        double sumaCalificaciones = 0;


        for (int i = 0; i < numCalificacionesObtenidas; i++) {
            System.out.print("Ingrese la calificación " + (i + 1) + ": ");
            calificaciones[i] = scanner.nextDouble();
            sumaCalificaciones += calificaciones[i];
        }


        int notasFaltantes = TOTAL_NOTAS - numCalificacionesObtenidas;

        double sumaNotasRequeridas = NOTA_MINIMA_APROBACION * TOTAL_NOTAS;
        double promedioNecesarioFaltantes = (sumaNotasRequeridas - sumaCalificaciones) / notasFaltantes;


        if (promedioNecesarioFaltantes <= 100) {
            System.out.println("Para aprobar el curso, necesitas un promedio de " + promedioNecesarioFaltantes + " en las " + notasFaltantes + " notas faltantes.");
        } else {
            System.out.println("Es imposible aprobar el curso con las notas faltantes, ya que necesitarías un promedio mayor a 100.");
        }

        scanner.close();
    }
}
