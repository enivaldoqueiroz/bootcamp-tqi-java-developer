package desafio.andandonotempo;

import java.io.IOException;
import java.util.Scanner;

public class Teste {
 
	public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		int a = leitor.nextInt();
		int b = leitor.nextInt();
		int c = leitor.nextInt();
		if (a + b == c || a + c == b || c + b == a || a == b ||  a == c  ||  c == b)  //complete com o c�digo nos espa�os em branco
			System.out.println("S");
		else 
			System.out.println("N");
	}
	
}
