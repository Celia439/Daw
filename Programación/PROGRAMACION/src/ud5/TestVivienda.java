package ud5;

public class TestVivienda {

	public static void main(String[] args) throws ApartamentoExeption {
		try {
			Propietario propietario1 = new Propietario("Juan Pérez", "12345678A");
			Apartamento apartamento = new Apartamento("Calle Falsa 123", 80, propietario1, 3, 'B');
			System.out.println(apartamento);
			System.out.println("Cuota de hipoteca del apartamento: " + apartamento.calcular_cuota() + " €");

			Propietario propietario2 = new Propietario("María López", "87654321B");
			Casa casa = new Casa("Avenida Real 45", 120, propietario2, true, false);
			System.out.println(casa);
			System.out.println("Cuota de hipoteca de la casa: " + casa.calcular_cuota() + " €");

			// Ejemplo con error
			Casa casaErronea = new Casa("Calle Error 999", -50, propietario1, true, true);
		} catch (IllegalArgumentException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

}
