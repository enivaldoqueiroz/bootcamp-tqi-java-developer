package exercicios.loopsearrays.loop;

import java.util.Scanner;

public class Ex2_Nota {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		//Minha solução
		/*int nota;
		boolean notaValida = true;
		do {
			System.out.println("Nota: ");
			nota = scan.nextInt();
			if (nota >=0 || nota<=10) {
				notaValida = true;
			} else {
				notaValida = false;
				System.out.println("Valor invalido");
			}
			
		} while(!notaValida);
		
		System.out.println("Valor entre 0 e 10");
		*/
		
		//Outra solução
		
		int nota;
		System.out.println("Nota: ");
		nota = scan.nextInt();
		
		while (nota < 0 || nota > 10) {
			System.out.println("Nota Invalida! Digite novamente a nota: ");
			nota = scan.nextInt();
		}
		
	}

}
