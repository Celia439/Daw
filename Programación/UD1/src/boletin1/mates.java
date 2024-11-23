package boletin1;

import java.util.Scanner;

public class mates {
	
public static void menu (String[] args) {
	Scanner sc =new Scanner(System.in);
	 int numero=0;
 do {
	 System.out.println("""
			 menu
			 1 añadir
			 2 Borrar
			 3 Modifica
			 4Muestra por pantalla
			 5 salir
			 """);
	 System.out.println("Elige una obccion del menu");
	 numero=sc.nextInt();
		switch (numero) {
		case 1:
			System.out.println("añadir");
			break;
		case 2:
			System.out.println("Borrar");
			break;
		case 3:
			System.out.println("Modificar");
			break;
		case 4:
			System.out.println("Mostrar por pantalla");
			break;
		case 5:
			System.out.println("Finalizar");
			break;

		default:
			System.out.println("te equibicaste de numero");
			break;
			}	
 	}while (numero!=5) ;

	}
}
