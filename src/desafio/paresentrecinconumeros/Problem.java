package desafio.paresentrecinconumeros;

import java.util.Scanner;

public class Problem {
    
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int quantidadePares = 0;

        for (int i = 0; i < 5; i++) {
            int n = scan.nextInt();
            
            //TODO: Implemente a condi��o abaixo verificando se "n" � par, ou seja, se o resto da divis�o de "n" por 2 � zero.
            if (n % 2 == 0) {
                quantidadePares++;
            }
        }
        System.out.printf("%d valores pares\n", quantidadePares);
    }
}
