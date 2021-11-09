package exercicios.loopsearrays.loop;

import java.util.Iterator;
import java.util.Scanner;

public class Ex6_Fatorial {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informa o numero que deseja ver a tabuada: ");
		int fatorial = scan.nextInt();
		
		int multiplicacao = 1;
		for (int i = fatorial; i >= 1; i--) {
			multiplicacao = multiplicacao * i;
		}		
		System.out.println(fatorial + "! = " + multiplicacao);
				
	}

}
