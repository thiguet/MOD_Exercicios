package Questao3;

//Implemente uma classe Pessoa. 
//Deve-se armazenar . Deve haver métodos
//para: construir a classe com valores 
//padrões ou entrados pelo usuário; 
//possuir atributos encapsulados;
//possuir métodos de acesso para permitir 
//alterar o valor desses atributos, 
//possuir métodos para permitir
//consultar o valor dos atributos; possuir 
//método para informar se é maior de idade. 
//Utilize a abordagem
//de desenvolvimento dirigido por teste. 
//Desenvolva uma classe aplicação para 
//ilustrar o funcionamento
//da classe Pessoa. Desenhe a classe 
//Pessoa na notação UML.

public class Pessoa {
	private String nome; 
	private	int idade;
	private char sexo;
	private Endereco endereco;
	
	public Pessoa () {}
	
	public Pessoa(String nome, int idade, char sexo) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public char getSexo() {
		return sexo;
	}
	
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
}
