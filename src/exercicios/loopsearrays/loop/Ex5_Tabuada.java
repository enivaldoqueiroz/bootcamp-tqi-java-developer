package exercicios.loopsearrays.loop;

import java.util.Iterator;
import java.util.Scanner;

public class Ex5_Tabuada {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informa o numero que deseja ver a tabuada: ");
		int tabuada = scan.nextInt();
		
		for (int i = 0; i < 10; i++) {
		System.out.println(i +" x " + tabuada + " = " + (tabuada * i));
		
		}
		
		//Todas as tabuadas 
		/*for (int i = 0; i < tabuada; i++) {
			System.out.println("1 x " + i + " = " + (1 * i));
			System.out.println("2 x " + i + " = " + (2 * i));
			System.out.println("3 x " + i + " = " + (3 * i));
			System.out.println("4 x " + i + " = " + (4 * i));
			System.out.println("5 x " + i + " = " + (5 * i));
			System.out.println("6 x " + i + " = " + (6 * i));
			System.out.println("7 x " + i + " = " + (7 * i));
			System.out.println("8 x " + i + " = " + (8 * i));
			System.out.println("9 x " + i + " = " + (9 * i));
		}*/
		
	}

}
