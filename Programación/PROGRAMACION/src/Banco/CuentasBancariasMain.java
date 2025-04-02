package Banco;

public class CuentasBancariasMain {
	public static void main(String[] args) throws PersonaDniNoValidoExeption, BancoCuentaInexistenteExeption {
		// Crear las personas para la cuenta bancaria
		Persona p1 = new Persona("Juan", "Pérez", "01234567L");
		Persona p2 = new Persona("Ana", "Gómez", "45340284Q");
		//Inicializar el banco
		Banco banco = new Banco();

		CuentaAhorro ca = new CuentaAhorro(p1, 100);
		CuentaCorrientePersonal ccp = new CuentaCorrientePersonal(p2, 2000, "Banco1, Banco2");
		CuentaCorrienteEmpresa cce = new CuentaCorrienteEmpresa(p1, 1000, "Banco3", 500);
		// Meter las cuentas de las personas en el banco
		banco.abrirCuenta(ca);
		banco.abrirCuenta(ccp);
		banco.abrirCuenta(cce);
		// Buscando cuenta en concreto
		System.out.println("\n\tInfo de la cuenta de juan y Ana\n");
		banco.informacionCuenta(p1.getDni());
		banco.informacionCuenta(p2.getDni());
		System.out.println("\n\tAntes de las transanciones\n");
		banco.listadoCuentas();

		// Realizando operaciones en la cuenta
		System.out.println("\n\tIngreso y retirada de las cuentas de Juan y Ana\n");
		banco.ingresoCuenta(p1.getDni(), 1000);
		banco.retiradaCuenta(p2.getDni(), 500);

		System.out.println("\n\tDespués de transacciones:\n");
		banco.listadoCuentas();
	}
}
