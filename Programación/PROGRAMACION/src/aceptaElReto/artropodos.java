package aceptaElReto;

import java.util.Scanner;

public class artropodos {

	static Scanner in;
	public static void casoDePrueba() {
	int insectos = in.nextInt();
	int aranidos= in.nextInt();

	System.out.println(insectos +" "+aranidos);

	} // casoDePrueba

	public static void main(String[] args) {

		in = new java.util.Scanner(System.in);

		int numCasos = in.nextInt();
		for (int i = 0; i < numCasos*5; i++)
			casoDePrueba();

	}
	/**
	 * 
2 
1 1 1 1 15
2 3 1 4 52

	 */
}
