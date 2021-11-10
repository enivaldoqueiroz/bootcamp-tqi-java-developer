package exercicios.loopsearrays.loop;


public class Ex8_LacoComInterrupcao {

	public static void main(String[] args) {

		for(int i = 1; i <= 14; i++) {
			if(i % 2 == 0) {
				if(i == 12) {
					break;
				}
				System.out.println("Nº "+ i);
			}
		}
		
//		boolean limitador = true;
//		int i = 1;
//		while(limitador) {
//			System.out.println("Texto " + i);
//			if(i==5) {
//				//break;
//				limitador = false;
//			}
//			i++;			
//		}
//		System.out.println("Fim das 5 repetições.");
//				
	}

}
