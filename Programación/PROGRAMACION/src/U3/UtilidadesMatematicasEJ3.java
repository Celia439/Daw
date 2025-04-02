package U3;

public class UtilidadesMatematicasEJ3 {
	public static int PosicionDigito(int numeros, int digito) {
		int posicion = 0;
		if (digito >= 0 && digito <= 9 && numeros > 0) {
			boolean encontrado = false;
			while (numeros > 0 && !encontrado) {
				if (numeros % 10 == digito) {
					encontrado = true;
				} else {
					numeros /= 10;
					posicion++;
				}
			}

			if (!encontrado) {
				posicion = -1;
			}

		}
		return posicion;
	}
}
