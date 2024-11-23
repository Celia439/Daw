package boletin1;

import java.util.Scanner;

public class ejb3 {

	public static void main(String[] args) {    
		Scanner sc = new Scanner(System.in);
		//boletin3EJh.posicionDeDigito(5123, 1);
		long num=5123;
		long posNum =1;
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
	 System.out.println(posicion);	
		sc.close();
		
	}

}
