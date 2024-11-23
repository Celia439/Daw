package boletin1;

import java.util.Scanner;

public class ejB {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("ostras vamos a hacer otra cosa");
		System.out.println("te voy a decir si introduciste algo en mayusculas");
		String mayuscula = scan.nextLine();
		String min=mayuscula.toLowerCase();
		if(min.equals(mayuscula)) {
			System.out.println("lo que escribiste no contiene ningunalra mayusculas mira tu mismo");
			System.out.println(mayuscula);	
		}else {
			System.out.println("tu frase contiene mayusculas MIRA");
			System.out.println(mayuscula);
		}
		scan.close();
	}

}
