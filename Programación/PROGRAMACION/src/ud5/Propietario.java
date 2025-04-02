package ud5;

public class Propietario {
	private String nombre_completo;
	private String Dni;
	/**
	 * @param nombre_completo
	 * @param dni
	 */
	public Propietario(String nombre_completo, String dni) {
		this.nombre_completo = nombre_completo;
		Dni = dni;
	}
	public String getNombre_completo() {
		return nombre_completo;
	}
	public void setNombre_completo(String nombre_completo) {
		this.nombre_completo = nombre_completo;
	}
	public String getDni() {
		return Dni;
	}
	public void setDni(String dni) {
		Dni = dni;
	}
	
	
}
