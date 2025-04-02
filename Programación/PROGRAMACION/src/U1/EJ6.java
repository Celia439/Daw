package U1;

public class EJ6 {
//	Esto hace matematicas con los operadores 
	public static void main(String[] args) {
		// prueba metodos matematicos

		System.out.println("Triple de un numero");
		double numerotripple = metodosEJ6.tripleDeUnNumero(1);
		System.out.print("\n");

		System.out.println(" La mitad de la última cifra de un número entero A ");
		numerotripple = (metodosEJ6.laMitadDeLaUltimaCifra(numerotripple));
		System.out.println("---" + numerotripple + "---\n");

		System.out.println("Comprobar si la última cifra de un número entero N es par ");
		metodosEJ6.ultimaCifraEsPar((int) numerotripple);
		System.out.print("\n");

		System.out.println("Comprobar si una variable A de tipo carácter contiene una letra mayúscula");
		metodosEJ6.caracterMayuscula('j');

		System.out.println("Comprobar si el contenido de la variable N termina en 0 ó en 7 ");
		metodosEJ6.terminaCeroSiete("siet4");
		
		System.out.println("Comprobar si un número entero N de dos cifras es capicúa. Un número es \r\n"
				+ "capicúa si se puede leer igual de derecha a izquierda que de izquierda a \r\n" + "derecha. ");
		metodosEJ6.capicua2(11);
		System.out.println("Quitarle a un número entero N su última cifra. Supondremos que N tiene \r\n"
				+ "más de una cifra. Por ejemplo si N contiene el valor 123 después de la operación contendrá el \r\n"
				+ "valor 12. ");
		metodosEJ6.quitaUltimaCifra(123);
		System.out.println(
				"Comprobar si una variable C de tipo char contiene un dígito. (Carácter entre \r\n" + "0 y 9) ");
		metodosEJ6.ceroNueve('5');
	}
	
}
