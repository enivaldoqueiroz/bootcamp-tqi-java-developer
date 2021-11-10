package desafio.batman;

import java.util.Scanner;

public class DesafioDIO {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int T = scan.nextInt();
        
        int viloesCapturados = 0; 
        if(T>=1) {
        	while(viloesCapturados < T) {
        		String vilao = scan.next();
        		//TODO: Imprima "Y" na linha abaixo, pois já temos o vilão em mãos ;-)
        		System.out.println("Y"); 
        		viloesCapturados++;
        	}       
        } else {
        	System.out.println("N");
        }
        	
    }
}
