package dateobjeto;

import java.util.Date;
import java.util.Calendar;
import java.util.Scanner;

public class CompararFechas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir la primera fecha al usuario
        System.out.println("Ingrese el año de la primera fecha:");
        int anio1 = scanner.nextInt();
        System.out.println("Ingrese el mes de la primera fecha (1-12):");
        int mes1 = scanner.nextInt();
        System.out.println("Ingrese el día de la primera fecha:");
        int dia1 = scanner.nextInt();

        // Pedir la segunda fecha al usuario
        System.out.println("Ingrese el año de la segunda fecha:");
        int anio2 = scanner.nextInt();
        System.out.println("Ingrese el mes de la segunda fecha (1-12):");
        int mes2 = scanner.nextInt();
        System.out.println("Ingrese el día de la segunda fecha:");
        int dia2 = scanner.nextInt();

        // Crear los objetos Calendar para las fechas ingresadas
        Calendar calendario1 = Calendar.getInstance();
        calendario1.set(anio1, mes1 - 1, dia1); 
        // Restar 1 al mes porque los meses en Calendar son indexados desde 0
        Date fecha1 = calendario1.getTime();

        Calendar calendario2 = Calendar.getInstance();
        calendario2.set(anio2, mes2 - 1, dia2);
        Date fecha2 = calendario2.getTime();

        // Comparar las fechas
        if (fecha1.after(fecha2)) {
            System.out.println("La fecha " + fecha1 + " es posterior a " + fecha2);
        } else if (fecha1.before(fecha2)) {
            System.out.println("La fecha " + fecha1 + " es anterior a " + fecha2);
        } else {
            System.out.println("Las fechas son iguales");
        }

        scanner.close();
    }
}

