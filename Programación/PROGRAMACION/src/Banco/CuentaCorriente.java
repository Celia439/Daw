package Banco;

abstract class CuentaCorriente extends CuentaBancaria {
	private String entidadesAutorizadas;

	public CuentaCorriente(Persona titular, double saldo, String entidadesAutorizadas) {
		super(titular, saldo);
		this.setEntidadesAutorizadas(entidadesAutorizadas);
	}

	public String getEntidadesAutorizadas() {
		return entidadesAutorizadas;
	}

	public void setEntidadesAutorizadas(String entidadesAutorizadas) {
		this.entidadesAutorizadas = entidadesAutorizadas;
	}
}
