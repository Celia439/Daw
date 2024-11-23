package boletin1;

import java.util.Scanner;

public class EJ1 {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	final String tupare="tu abuela en secreto";
	System.out.println("tu pare es " + tupare);
	System.out.println("dime un numero entero que sino me muero rapido y te digo si termino en 7 o en 0");
	int n =scan.nextInt();
	final int paridad= n%2;
	if (paridad==0) {
		System.out.println("el numero "+n+ " es par te salvaste");
	}else {
		System.out.println("lo sineto mucho tu numero "+n+" no es par");
	}
	int ultima =n%10;
	if(ultima==0) {
		System.out.println("confirmo termina en 0 mira " +n);
	}else {
		System.out.println(n+" no termina en 0");
	}
	if(ultima==7) {
		System.out.println("confirmo termina en 7 mira " +n);		
	}else {
		System.out.println(n+" no termina en 7");
	}
	scan.close();
	}
}
