package aceptaElReto;

import java.util.Scanner;

public class ligaDePadel {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// para salir
		String fin = "";
		// guardar equipos y quien gano
		String[] equipos = new String[2000];
		int indice = 0;
		// programa
		while (!fin.equals("fin")) {
			// nombre de los equipos
			System.out.println("deme el nombre del primer equipo");
			String equipo1 = sc.nextLine();
			System.out.println("deme el nombre del segundo equipo");
			String equipo2 = sc.nextLine();
			// comprobar si son iguales
			if (equipo1.trim().equals(equipo2.trim())) {
				System.out.println("no pueden llamarse igual los dos equipos");
			} else {
				// metet los equipos en el array
				equipos[indice] = " " + equipo1 + " ";
				indice++;
				equipos[indice] = " " + equipo2 + " ";
				indice++;
				// rondas jugadas
				System.out
						.println("cuantas rondas han hecho estos dos eqipos?");
				int rondas = sc.nextInt();
				int numronda = rondas;
				// limpiando entrada
				sc.nextLine();
				int contador = 1;
				int puntosE1 = 0;
				int puntosE2 = 0;
				// rondas jugadas de los dos equipos
				while (rondas != 0) {
					// preguntar quien gano
					System.out
							.println("--------Ronda" + contador + "---------");
					System.out.println("Que equipo gano la ronda?");

					String ganador = sc.nextLine();

					if (ganador.equals(equipo1)) {
						// gana eq 1
						puntosE1++;
					} else if (ganador.equals(equipo2)) {
						// gana eq2
						puntosE2++;
					} else {
						// se escribio mal el equipo
						rondas++;
						contador--;
						System.out.println("equipo " + ganador
								+ " no existe deven de ser equipo " + equipo1
								+ " o equipo " + equipo2);
					}
					// todo perfe y restamos para la siguiente ronda
					rondas--;
					contador++;
				}
				// mostrar quien gano
				if (puntosE1 > puntosE2) {
					System.out.println("Ha ganado el equipo " + equipo1);
					equipos[indice] = " Gano el equipo: " + equipo1 + " con "
							+ puntosE1 + "/" + puntosE2 + " de " + numronda
							+ " rondas";
					indice++;
				} else if (puntosE1 < puntosE2) {
					System.out.println("Ha ganado el equipo " + equipo2);
					equipos[indice] = " Gano el equipo: " + equipo2 + " con "
							+ puntosE2 + "/" + puntosE1 + " de " + numronda
							+ " rondas";
					indice++;
				} else {
					System.out.println("Los equipos: " + equipo1 + " y "
							+ equipo2 + " han quedado empatados");
					equipos[indice] = "  Empate ";
					indice++;
				}
				System.out.println("quiere continuar?");
				String sino = sc.nextLine();
				if (sino.equalsIgnoreCase("no")) {
					System.out
							.println("Equipos inscritos y quienes han ganado");
					int salto = 1;
					int i = 0;
					while (equipos[i] != null || equipos.length > 2000) {
						if (salto != 3) {
							System.out.print(equipos[i]);
							salto++;
						} else if (salto == 3) {
							System.out.println(equipos[i]);
							salto = 1;
						}
						i++;
					}
					System.out.println("cerrando competicion...");
					fin = "fin";
				}

			}
		}
		sc.close();
	}
}
