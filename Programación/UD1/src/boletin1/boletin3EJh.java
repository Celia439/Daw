package boletin1;

public class boletin3EJh {
public static int posicionDeDigito (long num , int posNum ) {
	int cifras=4;
	int posicion=0;
	long resto =0;
	while(resto!=posNum) {
		if(posicion==0) {
			resto=(num/10)%10;
		}else {
			resto=(long) ((num/Math.pow(10, cifras-1))%10);
		}
		posicion++;
	}
	return posicion;
}
}
