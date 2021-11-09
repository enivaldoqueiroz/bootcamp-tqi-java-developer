package exercicios.loopsearrays.array;

public class Ex2_Consoanted {

	public static void main(String[] args) {
		
		int[] vetor = {-5, 6, 15, 50, 8, 4};
		
		System.out.println("Tamanho do vetor " + vetor.length);
		
		for(int i = (vetor.length-1); i >= 0; i--) {
			System.out.print(vetor[i] + " ");
		}
	}

}
