package U3;

public class usoDeObjetos {

	public static void main(String[] args) {
		// h)
		System.out.println("numero 5123 posicion del 2 es " + utilidadesMatematicas.posicionDeDigito(5123, 2));
		// s)
		System.out.println("factorial de 5 es " + utilidadesMatematicas.factorial(5));
		// t)
		System.out.println("""
				145.50 euros son
				""" + utilidadesMatematicas.cambioExtracto(145.50));
		// a)
		System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
		System.out.print("Si naciste en 2005 ahora tendras " + utilidadesFechas.CalcularEdad(null) + " años");
	}

}
