package Banco;

public class Persona {
	// Letras válidas del DNI
	public static final String LETRAS = "TRWAGMYFPDXBNJZSQVHLCKE";

	// Atributos
	private String nombre;
	private String apellido;
	private String dni;

	// Constructor
	public Persona(String nombre, String apellido, String dni) throws PersonaDniNoValidoExeption {
		this.nombre = nombre;
		this.apellido = apellido;
		setDni(dni); // Validar y asignar el DNI
	}

	// Getters y Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) throws PersonaDniNoValidoExeption {
		if (comprobarDni(dni)) {
			this.dni = dni;
		} else {
			throw new PersonaDniNoValidoExeption("DNI inválido.");
		}
	}

	// Método para comprobar la validez del DNI
	// Método para comprobar la validez del DNI
	public boolean comprobarDni(String dni) {
	    boolean dniCorrecto = false; // Variable para almacenar si el DNI es válido o no
	    String dniPattern = "[0-9]{8}[" + LETRAS + LETRAS.toLowerCase() + "]"; // Expresión regular para validar el formato del DNI (8 números seguidos de una letra)
	    
	    if (dni.matches(dniPattern)) { // Verifica si el DNI cumple con el patrón establecido
	        String numStr = dni.substring(0, 8); // Extrae los 8 primeros caracteres (números) del DNI
	        Integer num = Integer.parseInt(numStr); // Convierte la cadena de números en un entero
	        Character letraCorrecta = LETRAS.charAt(num % 23); // Calcula la letra correcta según el módulo 23 de la numeración
	        Character letra = dni.toUpperCase().charAt(8); // Obtiene la letra del DNI ingresado, asegurando que esté en mayúscula
	        
	        if (letraCorrecta == letra) { // Compara la letra calculada con la del DNI ingresado
	            dniCorrecto = true; // Si coinciden, el DNI es válido
	        }
	    }
	    
	    return dniCorrecto; // Devuelve true si el DNI es válido, false en caso contrario
	}

}
