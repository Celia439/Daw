package boletin1;

import java.util.Scanner;

public class ejEFGH {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);    
	System.out.println("oye tu si eres del cadi respondeme sino pon un espacio a lo que voy");
	System.out.println("dame un numero y te diré si es capicua");
	int n=scan.nextInt();
	int dividendo = n;
	int pri = 0;
	while (dividendo != 0) {
		pri = dividendo;
		dividendo /= 10;
	}
	
	System.out.println(pri);
	scan.close();
	}

}
