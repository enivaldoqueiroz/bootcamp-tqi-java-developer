package exercicios.loopsearrays.loop;


public class Ex7_LacoComInterrupcao {

	public static void main(String[] args) {

		for(int i = 3; i < 11; i+=2) {
			if(i == 7) {
				continue;
			}
			System.out.println("Nº "+ i);
		}
		
		boolean limitador = true;
		int i = 1;
		while(limitador) {
			System.out.println("Texto " + i);
			if(i==5) {
				//break;
				limitador = false;
			}
			i++;			
		}
		System.out.println("Fim das 5 repetições.");
				
	}

}
