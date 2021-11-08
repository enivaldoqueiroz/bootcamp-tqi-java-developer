package exercicios.clbsaula03;

/**
 * 
 * @author jecq
 * 
 * Classe de exemplo para o exercicio da Aula 3 de Operadores l�gicos e relacionais, controle de fluxo e blocos.
 */

public class Main {

	public static void main(String[] args) {

		ifFlecha();
		ifSemFlecha();
		ifFerias();
		ifMenor();
		
//		switchSemana();
//		switchNumero();
//		switchFerias();

	}
	
	//Devemos evitar o efeito flexa
	private static void ifFlecha() {
		
		int mes = 9;
		if(mes == 1) {
			System.out.println("Janeiro");
		} else {
			if (mes == 2) {
				System.out.println("Fevereiro");
			} else {
				if (mes == 3) {
					System.out.println("Mar�o");
				} else {
					if (mes == 4) {
						System.out.println("Abril");
					} else {
						if (mes == 5) {
							System.out.println("Maio");
						} else {
							if (mes == 6) {
								System.out.println("Junho");
							} else {
								if (mes == 7) {
									System.out.println("Julho");
								} else {
									if (mes == 8) {
										System.out.println("Setembro");
									} else {
										if (mes == 9) {
											System.out.println("Agosto");
										} else {
											if (mes == 10) {
												System.out.println("Outubro");
											} else {
												if (mes == 11) {
													System.out.println("Novembro");
												} else {
													if (mes == 12) {
														System.out.println("Dezembro");
													} else {
														System.out.println("Mes indefinido");
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
			
		} 
		
	}
	
	private static void ifSemFlecha() {
		int mes = 9;
		if (mes == 1) {
			System.out.println("Janeiro");
		} else if (mes == 2) {
			System.out.println("Fevereiro");
		} else if (mes == 3) {
			System.out.println("Mar�o");
		} else if (mes == 4) {
			System.out.println("Abril");
		} else if (mes == 5) {
			System.out.println("Maio");
		} else if (mes == 6) {
			System.out.println("Junho");
		} else if (mes == 7) {
			System.out.println("Julho");
		} else if (mes == 8) {
			System.out.println("Agosto");
		} else if (mes == 9) {
			System.out.println("Setembro");
		} else if (mes == 10) {
			System.out.println("Outubro");
		} else if (mes == 11) {
			System.out.println("Novembro");
		} else if (mes == 12) {
			System.out.println("Dezembro");
		}
	}
	
	// Tamb�m devemos evitar usar o if neste caso. Pois estamos trabalhando com apenas uma variavel
	private static void ifFerias() {
		
		String mes = "julho";
		
		if (mes == "julho" || mes == "dezembro" || mes == "janeiro") {
			System.out.println("F�rias");
		}
	}
	
	private static void ifMenor() {
		
		double salarioMensal = 11893.58d;
		double mediaSalario = 10500d;
		
		int quantidadeDependentes = 4;
		int mediaDependentes = 2;
		
		//Solu�ao que deve ser evitada
		if ((salarioMensal < mediaDependentes) && (quantidadeDependentes >= mediaDependentes)) {
			System.out.println("Funcionario deve receber auxilio.");
		}
		
		//Solu�ao adeguada
		boolean salarioBaixo = salarioMensal < mediaSalario;
		boolean muitosDependentes = quantidadeDependentes >= mediaDependentes;
		
		if ((salarioBaixo) && (muitosDependentes)) {
			System.out.println("Funcionario deve receber auxilio.");
		}
		
		boolean recebeAuxilio = (salarioBaixo) && (muitosDependentes);
		if (recebeAuxilio) {
			System.out.println("Funcionario deve receber auxilio.");
		} else {
			System.out.println("Funcionario n�o deve receber auxilio.");
		}
	}

}
