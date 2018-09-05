package Questao3;

public class PessoaJuridica extends Pessoa {
	private String cnpj;
	
	public PessoaJuridica() {}
	
	public PessoaJuridica(String nome, int idade, char sexo, String cnpj) {
		super(nome, idade, sexo);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
}
