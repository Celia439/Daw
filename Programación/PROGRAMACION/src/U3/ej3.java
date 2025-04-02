package U3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ej3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Introduce un numero");
			int num1=sc.nextInt();
			System.out.println("Introduce un numero");
			int num2=sc.nextInt();
			int num=num1/num2;
			System.out.println("Division ="+num);
		}catch (InputMismatchException e) {
			System.out.println("oh no introduciste algo que no era numerico");
		}catch(ArithmeticException a){
			System.out.println("no es posible hacer la division algo anda mal");
		}
	}

}

