package exercicios.loopsearrays.loop;

import java.util.Scanner;

public class Ex4_ParEImpar {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int quantidadeNumeros;
		int numero;
		
		System.out.println("Quantidade de numeros: ");
		quantidadeNumeros = scan.nextInt();
		
		int count = 0;
		
		do {
			System.out.println("Numero: ");
			numero = scan.nextInt();
			if(numero % 2 == 0) {
				System.out.println("O Numero " + numero + " é par");
			} else {
				System.out.println("O Numero " + numero + " é impar");
			}
			count++;
		} while (count < quantidadeNumeros);
		
		System.out.println("Temino da DO WHILE");
		
	}

}
