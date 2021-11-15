package poo;

import java.util.ArrayList;

import poo.modal.Cliente;
import poo.modal.Endereco;

public class EntregaCartaoApp {

	public static void main(String[] args) {

		Endereco endereco = new Endereco();
		endereco.cep = "000000000";
		// dados do endereco
		Cliente cliente = new Cliente();
		// dados do cliente
		
		try {
			cliente.adicionaEndereco(endereco);
			System.out.println("Endereco adicionado com sucesso!");
			
		} catch (Exception e) {
			System.err.println("Houve um erro ao adicionar endereco!" + e.getMessage());
		}
	}

}
