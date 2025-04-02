package Banco;

import java.util.Random;

public abstract class CuentaBancaria implements Imprimible {
	// Atributos
	private Persona titular;
	private double saldo;
	private String iban;

	// constructor
	public CuentaBancaria(Persona titular, double saldoAct) {
		this.titular = titular;
		this.saldo = saldoAct;
		this.iban = generarIBAN();
	}

	// getters setters
	public Persona getTitular() {
		return titular;
	}

	public void setTitular(Persona titular) {
		this.titular = titular;
	}

	public double getSaldoAct() {
		return saldo;
	}

	public void setSaldoAct(double saldoAct) {
		this.saldo = saldoAct;
	}

	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}

	// Médtodos
	private String generarIBAN() {
		Random random = new Random();
		StringBuilder ibanBuilder = new StringBuilder("ES");

		for (int i = 0; i < 20; i++) { // Generamos 20 dígitos aleatorios
			ibanBuilder.append(random.nextInt(10)); // Números entre 0 y 9
		}

		return ibanBuilder.toString();
	}

	@Override
	public String devolverInfoString() {
		return "IBAN: " + iban + ", Titular: " + titular.getNombre() + " " + titular.getApellido() + ", Saldo: "
				+ saldo;
	}

}
