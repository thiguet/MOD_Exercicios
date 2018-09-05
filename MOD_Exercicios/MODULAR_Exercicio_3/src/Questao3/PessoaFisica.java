package Questao3;

public class PessoaFisica extends Pessoa {
	private String cpf;

	public PessoaFisica() {
		super();
	}

	public PessoaFisica(String nome, int idade, char sexo, String cpf) {
		super(nome, idade, sexo);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}
