package boletin1;

import java.util.Scanner;

public class boletin2 {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
int totalDinero=0;

for(int i=7;i>0;i--) {
	
	if(i==7) {
		String dia="lunes";
		System.out.println("cuantas horas trabajaste el "+ dia);

	}
	if(i==6)  {
		String dia="martes";
		System.out.println("cuantas horas trabajaste el "+ dia);

	}
	if(i==5) {
		String dia="mirecoles";
		System.out.println("cuantas horas trabajaste el "+ dia);

	}
	if(i==4) {
		String dia="jueves";
		System.out.println("cuantas horas trabajaste el "+ dia);

	}
	if(i==3) {
		String dia="viernes";
		System.out.println("cuantas horas trabajaste el "+ dia);
	}
	if(i==2) {
		String dia="savado";
		System.out.println("cuantas horas trabajaste el "+ dia);
	}
	if(i==1) {
		String dia="domingo";
		System.out.println("cuantas horas trabajaste el "+ dia);
	}
	int h=scan.nextInt();
	if(h<40) {
		int dinero40=h*12;
				totalDinero+=dinero40;		
	}
	if(h>40) {
		int dinero41=h*16;
		totalDinero+=dinero41;
	}

}
System.out.println("eta senana as cobrado "+totalDinero+" leuro");
scan.close();
	}

}
