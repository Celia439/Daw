package ud5;

public class Apartamento extends Vivienda {
	private int piso;
	private char puerta;
	
	public Apartamento(String direccion, float metro_cuadrado, Propietario propietario, int piso,char puerta) throws ApartamentoExeption {
		super(direccion, metro_cuadrado, propietario);
		if(comprovar_piso(piso)) {
		this.piso= piso;
		}else {
			throw new ApartamentoExeption("No pueden ser numeros negativos");
		}
		this.puerta=puerta;
	}

	public int getPiso() {
		return piso;
	}

	public void setPiso(int piso) throws ApartamentoExeption {
		if(comprovar_piso(piso)) {
			this.piso= piso;
			}else {
				throw new ApartamentoExeption("No pueden ser numeros negativos");
			}	}

	public char getPuerta() {
		return puerta;
	}

	public void setPuerta(char puerta) {
		this.puerta = puerta;
	}

	@Override
	String calcular_cuota() {
		float metros=super.getMetro_cuadrado();
		String a="la cuota de la vivienda:apartamento del propietario"+super.getPropietario().getNombre_completo()+" es "+(metros*1.2)+" €";
		return a;
	}
	
	@Override
	public String toString() {
		return "Apartamento [piso=" + piso + ", puerta=" + puerta + "]";
	}

	private boolean comprovar_piso(int piso) {
		return piso <0?false :true;
	}
}
