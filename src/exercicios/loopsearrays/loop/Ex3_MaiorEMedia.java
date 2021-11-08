package exercicios.loopsearrays.loop;

import java.util.Scanner;

public class Ex3_MaiorEMedia {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int count = 0;
		int maior = 0;
		float somaNumeros = 0;
		float media;
		do {
			System.out.println("Numero: ");
			int numero = scan.nextInt();
			if (numero > maior) {
				maior = numero;
			}
			somaNumeros = somaNumeros + numero;
			count++;
		} while (count < 5);
		
		media = somaNumeros/5;
		
		System.out.println("Esse é o maior numero informado: " + maior);
		System.out.println("Media: " + media);
		System.out.println("Fim do laço DO WHILE");
	}

}
