package ud5;

public abstract class Vivienda {
	private String direccion;
	private float metro_cuadrado;
	private Propietario propietario;
	/**
	 * @param direccion
	 * @param metro_cuadrado
	 * @param propietario
	 */
	public Vivienda(String direccion, float metro_cuadrado, Propietario propietario) {
		super();
		this.direccion = direccion;
		this.metro_cuadrado = metro_cuadrado;
		this.propietario = propietario;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public float getMetro_cuadrado() {
		return metro_cuadrado;
	}
	public void setMetro_cuadrado(float metro_cuadrado) {
		this.metro_cuadrado = metro_cuadrado;
	}
	public Propietario getPropietario() {
		return propietario;
	}
	public void setPropietario(Propietario propietario) {
		this.propietario = propietario;
	}
	
	abstract String calcular_cuota();
}
