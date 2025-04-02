package U1;

public class metodosEJ6 {

	public static int tripleDeUnNumero(double numero) {
		// Calcula el triple del número
		double respuesta = numero * 3;

		// Muestra la respuesta en consola
		System.out.println("---El triple de " + numero + " es: " + respuesta + "---");

		// Convierte a int y retorna
		return (int) respuesta;

	}

	// pilla la ultima cifra la y la divide entre dos
	public static double laMitadDeLaUltimaCifra(double numero) {
		double mitad = ((numero % 10) / 2);
		return mitad;
	}

	// comprueba si la ultima cifra de un numero es par
	public static void ultimaCifraEsPar(double numero) {
		if ((numero % 10) % 2 == 0) {
			System.out.println("---Es par el numero " + numero + "---");
		} else {
			System.out.println("---No es par el numero " + numero + "---");

		}
	}

	// comprueba si un caracter introducido por parametro esta en mayusculas
	public static void caracterMayuscula(Character A) {
		String letrasValidas = "[a-zA-z]";
		String a = Character.toString(A);
		try {
			// controlar caracteres no validos
			if (!a.matches(letrasValidas)) {
				throw new Exception("eso no es una letra");
			}
			// comprovar mayusculas y min
			if (A.equals(Character.toUpperCase(A))) {
				System.out.println("--- " + A + " ESTA EN MAUSCULAS ---\n");
			} else {
				System.out.println("--- " + A + " esta en minuscsulas ---\n");
			}

		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

	// dos metodos para hacer funciones iguales si un numero termina en 0 o 7
	public static void terminaCeroSiete(String texto) {
		String validos = "[1-9]";
		String ultimo = "" + texto.charAt(texto.length() - 1);
		if (!ultimo.matches(validos)) {
			System.err.println("--- Este no es un numero ---");
		}
		if (ultimo.equals("0")) {
			System.out.println("--- " + ultimo + " Termina en 0 ---\n");
		} else if (ultimo.equals("7")) {
			System.out.println("--- " + ultimo + " Termina en 7 ---\n");
		} else {
			System.out.println("--- " + texto + " No termina ni 0 ni 7 ---\n");
		}
	}

	public static void terminaCeroSiete(int numeros) {
		if (numeros % 10 == 0) {
			System.out.println("--- " + numeros + " Termina en 0 ---\n");
		} else if (numeros % 10 == 7) {
			System.out.println("--- " + numeros + " Termina en 7 ---\n");
		} else {
			System.out.println("--- " + numeros + " No termina ni 0 ni 7 ---\n");
		}
	}

	// es capicua 2
	public static void capicua2(int numeros) {
		if (numeros > 10 && numeros < 100) {
			if (numeros % 10 == numeros / 10) {
				System.out.println("--- Es capicua :" + numeros + "---\n");
			} else {
				System.out.println("--- No es capicua :" + numeros + "---\n");
			}
		} else {
			System.err.println("--- Solo se permite dos cifras ---");
		}
	}
	//Quitar la ultima cifra de un numero
	public static void quitaUltimaCifra(int cifra) {
		 int sinUltimaCifra = cifra / 10;
		System.out.println("--- Sin la ultima cifra queda "+(sinUltimaCifra)+"---\n");
	}
//comprobar di caracter contiene un digito entre 0-9
	public static void ceroNueve(char C) {
	    if (Character.isDigit(C)) {
	        System.out.println("--- El carácter '" + C + "' es un dígito entre 0 y 9.---\n");
	    } else {
	        System.out.println("--- El carácter '" + C + "' NO es un dígito entre 0 y 9.---\n");
	    }
	}

}
