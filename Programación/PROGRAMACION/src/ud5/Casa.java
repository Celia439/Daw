package ud5;

public class Casa extends Vivienda {
	private boolean piscina;
	private boolean jardin;

	public Casa(String direccion, float metro_cuadrado, Propietario propietario, boolean piscina, boolean jardin) {
		super(direccion, metro_cuadrado, propietario);
		this.jardin = jardin;
		this.piscina = piscina;
	}

	public boolean isPiscina() {
		return piscina;
	}

	public void setPiscina(boolean piscina) {
		this.piscina = piscina;
	}

	public boolean isJardin() {
		return jardin;
	}

	public void setJardin(boolean jardin) {
		this.jardin = jardin;
	}

	@Override
	public String toString() {
		return "Casa [piscina=" + piscina + ", jardin=" + jardin + "]";
	}

	@Override
	String calcular_cuota() {
		float cuota = (super.getMetro_cuadrado() * 1.5f);
		if (this.jardin && this.piscina) {
			cuota +=45f;
		} else if (this.jardin || this.piscina) {
			cuota +=30f;
		}
		String a = "La cuota de la vivienda: casa del propietario" + super.getPropietario().getNombre_completo()
				+ " es " + cuota + " €";
		return a;
	}

}
