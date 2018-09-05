package Questao3;

public class Endereco {
	private String nome, 
				   endereco, 
				   cidade, 
				   telefone, 
				   cep;
	private char[] uF;
	
	public Endereco () {}

	public Endereco(String nome, String endereco, String cidade, String telefone, String cep, char[] uF) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.cidade = cidade;
		this.telefone = telefone;
		this.cep = cep;
		this.uF = uF;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public char[] getuF() {
		return uF;
	}

	public void setuF(char[] uF) {
		this.uF = uF;
	};
	
}
