package Banco;

public class Banco {
	// Atributos
	private static final int MAX_CUENTAS = 100;
	private CuentaBancaria[] cuentas;
	private int cantidadCuentas;

	// Constructor
	public Banco() {
		cuentas = new CuentaBancaria[MAX_CUENTAS]; // Capacidad máxima de 100 cuentas
		cantidadCuentas = 0;
	}

	// Getters and Setters
	public CuentaBancaria[] getCuentas() {
		return cuentas;
	}

	public void setCuentas(CuentaBancaria[] cuentas) {
		this.cuentas = cuentas;
	}

	public int getCantidadCuentas() {
		return cantidadCuentas;
	}

	public void setCantidadCuentas(int cantidadCuentas) {
		this.cantidadCuentas = cantidadCuentas;
	}

	// Métodos
	/**
	 * Abrir Cuenta: Le pasamos una cuenta bancaria y devuelve true si se guardo la
	 * cuenta y false si no se introducierón los datos correctamete o no hay espacio
	 * en el banco.
	 * 
	 * @param cuenta
	 * @return
	 */
	public boolean abrirCuenta(CuentaBancaria cuenta) {
		boolean añadido = false;
		int i = 0;
		// Verifica si hay espacio disponible
		if (cantidadCuentas >= 100) {
			System.out.println("No se pueden abrir más cuentas, límite alcanzado.");
		} else {
			// Verifica si hay un espacio vacío en el array para añadir la nueva cuenta
			while (i < cuentas.length && !añadido) {
				if (cuentas[i] == null) {
					cuentas[i] = cuenta; // Asigna la cuenta al espacio vacío
					cantidadCuentas++; // Incrementa el contador de cuentas
					añadido = true; // Cuenta añadida correctamente
				} else {
					i++;
				}
			}
		}
		return añadido;
	}

	/**
	 * Método Para realizar una retirada de dinero de una cuenta específica por IBAN o dni
	 * devuelve un boolean si se ejecuto correctamente
	 * 
	 * @param identificacion
	 * @param cantidad
	 * @return
	 * @throws BancoCuentaInexistenteExeption 
	 */

	public boolean retiradaCuenta(String identificacion, double cantidad) throws BancoCuentaInexistenteExeption {
		boolean retirado = false;
		//bucar la cuenta
		CuentaBancaria cuenta = buscarPorDniIban(identificacion);
		if (cuenta != null) {
			if (cuenta.getSaldoAct() >= cantidad) {
				// Realiza la retirada
				cuenta.setSaldoAct((cuenta.getSaldoAct() - cantidad));
				System.out.println("Retiro exitoso. Nuevo saldo: " + cuenta.getSaldoAct());
				retirado = true; // Operación realizada correctamente
			} else {
				// no hay suficiente saldo
				System.out.println("No hay saldo suficiente para realizar el retiro.");
			}
		} else {
			// si la cuenta es null no existe o la pusieron mal
			throw new BancoCuentaInexistenteExeption("La cuenta no existe o se equivocó al escribirla.");
		}

		return retirado; // Retorna el resultado de la operación
	}

	/**
	 *  Método void para mostrar todas las cuentas
	 *  recorre el arrat de cuentas bancarias
	 */
	public void listadoCuentas() {
		//recorer el array y mostrar las que no sea null con devolverInfoString
		
		for (int i = 0; i < cantidadCuentas; i++) {
			if (cuentas[i] != null) {
				System.out.println(cuentas[i].devolverInfoString());
			}
		}
	}

	/**
	 * Método para obtener la información de una cuenta por IBAN 
	 * Utiliza el metodo buscar por dni o iban para encontrar la cuenta .
	 * Hace un devolver info string de la inerfaz de la cuenta que se encuentre.
	 * @param identificacion 
	 * @return
	 * @throws BancoCuentaInexistenteExeption 
	 */
	public boolean informacionCuenta(String identificacion) throws BancoCuentaInexistenteExeption {
		boolean encontrada = false;
		// encontrar la cuenta concreta
		CuentaBancaria cuenta = buscarPorDniIban(identificacion);
		// si la cuenta no se encuentra
		if (cuenta.equals(null)) {
			throw new BancoCuentaInexistenteExeption("La cuenta no existe o se equivocó al escribirla.");

		} else {
			// si la cuenta se encuentra
			System.out.println(cuenta.devolverInfoString());

		}
		return encontrada;

	}

	/**
	 * Método para ingresar dinero en una cuenta Utiliza el metodo buscar por dni o
	 * iban para encontrar la cuenta y si la encuentra ingresa el dinero en ella
	 * 
	 * @param identificacion
	 * @param cantidad
	 * @return
	 * @throws BancoCuentaInexistenteExeption 
	 */

	public boolean ingresoCuenta(String identificacion, double cantidad) throws BancoCuentaInexistenteExeption {
		boolean ingresado = false;
		// buscar la cuenta por dni o iban
		CuentaBancaria cuenta = buscarPorDniIban(identificacion);
		// comprovar que no este vacia
		if (cuenta != null) {
			// Realiza el ingreso
			cuenta.setSaldoAct(cuenta.getSaldoAct() + cantidad); // Suma el dinero al saldo
			System.out.println("Ingreso exitoso. Nuevo saldo: " + cuenta.getSaldoAct());
			ingresado = true; // Operación realizada correctamente

		} else {
			// si la cuenta es null no existe o la pusieron mal
			throw new BancoCuentaInexistenteExeption("La cuenta no existe o se equivocó al escribirla.");
		}

		return ingresado; // Retorna el resultado de la operación
	}

	/**
	 * Método busqueda por dni y iban. Devuelve una cuenta Bancaria por dni o iban
	 * si no existe devuelve null
	 * 
	 * @param identificacion
	 * @return
	 */

	public CuentaBancaria buscarPorDniIban(String identificacion) {
		// variable donde guardar la cuenta si se encuentra
		CuentaBancaria cb = null;
		// avanzar en el array
		int indice = 0;
		// verificar si existe
		boolean encontrado = false;
		//que se haya encontrado la cuenta o lleges al final de la cuenta
		while (indice > MAX_CUENTAS || !encontrado) {
			//si la cuenta no es nula y el identificacion es igual a un iban o dni
			if (cuentas[indice] != null && ((cuentas[indice].getIban().equals(identificacion))
					|| (cuentas[indice].getTitular().getDni().equals(identificacion)))) {
				//asignar la cuenta para devolverla
				cb = cuentas[indice];
				//indicar que deje de buscar
				encontrado = true;
			}
			// si aun no se encuentra avanzar en el array
			indice++;
		}
		return cb;
	}
}
