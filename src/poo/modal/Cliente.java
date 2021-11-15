package poo.modal;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	public Integer codigo;
	public String nome;
	public String cpf;
	
	private List<Endereco> enderecos;
	
	public void adicionaEndereco(Endereco endereco) {
		if (endereco == null) {
			throw new NullPointerException("Endereco nao pode ser nulo");
		}
		
		if (endereco.cep == null) {
			throw new NullPointerException("Cep nao pode ser nulo");
		}
		
		getEnderecos().add(endereco);
	}
	
//	public void setEnderecos(List<Endereco> enderecos) {
//		this.enderecos = enderecos;
//	}
	
	private List<Endereco> getEnderecos() {
		if (enderecos == null) {
			enderecos = new ArrayList<Endereco>();
		}
		return enderecos;
	}
}
