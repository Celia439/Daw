package U3;

public class utilidadesMatematicas {
	/**
	 * Este metodo devuelve la posición del segundo numero introducido en el primer numero introducido. 
	 *Empieza de izquierda a derecha
	 * @param numero
	 * @param digito
	 * @return
	 */
	public static int posicionDeDigito (long numero, int digito) {
		int posicion = 1;
		boolean encontrado=false;
		while (!encontrado&& numero!=0) {
			long digitoActual = numero % 10;
		    if (digitoActual == digito) {
		    	encontrado=true;
		    }
		   numero /= 10;
		    posicion++;
		    }
		if(posicion>numero) {
			System.out.println("no se encontro el numero");
			posicion=-1;
		}
    	return posicion;
	}
	/**
	 * Este metodo devuelve el factorial de el numero que se le introduce por parametro
	 * (en el caso que sea 0 regresa el 1 de resultado)
	 * @param num
	 */
	public static long factorial(long num) {
		long resultado=1;
		for(long i=1;i<=num;i++){
			resultado*=i;
		}
		return  resultado;
	}
	/*
	 * Este metotodo devuelve el numero de billetes y monedas de la cantidad que pasa por parametro. 
	 */
	public static String cambioExtracto(double num) {
		long numAct=(long)num;
		//Billetes
		long Bcien=0, Bcincuenta=0, Bveinte=0, Bdiez=0, Bcinco=0;
		if(numAct%100>=0) {
			Bcien = numAct/100;
			numAct%=100;
		}
		if(numAct%50>=0){
			Bcincuenta = numAct/50;
			numAct%=50;
		}
		if(numAct%20>=0){
			Bveinte = numAct/20;
			numAct%=20;
		}
		if(numAct%10>=0){
			Bdiez = numAct/10;
			numAct%=10;
		}
		if(numAct%5>=0){
			Bcinco = numAct/5;
			numAct%=5;
		}
		//Centimos
		long centimos = Math.round((num - (long) num) * 100);
		long M50 = 0, M20 = 0, M10 = 0, M5 = 0, M2 = 0, M1 = 0;
		if (centimos >= 50) { 
			M50 = centimos / 50; centimos %= 50; 
			}
		if (centimos >= 20) { 
			M20 = centimos / 20; centimos %= 20; 
			}
		if (centimos >= 10) {
			M10 = centimos / 10; centimos %= 10; 
			}
		if (centimos >= 5) {
			M5 = centimos / 5; centimos %= 5;
		}
		if (centimos >= 2) {
			M2 = centimos / 2; centimos %= 2; 
			}
		if (centimos >= 1) {
			M1 = centimos; 
			} 
		String resultado = ""; 
		resultado += Bcien + " billete(s) de 100 €\n";
		resultado += Bcincuenta + " billete(s) de 50 €\n";
		resultado += Bveinte + " billete(s) de 20 €\n"; 
		resultado += Bdiez + " billete(s) de 10 €\n"; 
		resultado += Bcinco + " billete(s) de 5 €\n"; 
		resultado += M50 + " moneda(s) de 50 cts\n"; 
		resultado += M20 + " moneda(s) de 20 cts\n"; 
		resultado += M10 + " moneda(s) de 10 cts\n"; 
		resultado += M5 + " moneda(s) de 5 cts\n"; 
		resultado += M2 + " moneda(s) de 2 cts\n"; 
		resultado += M1 + " moneda(s) de 1 cts\n";
		return resultado;
	}
}
