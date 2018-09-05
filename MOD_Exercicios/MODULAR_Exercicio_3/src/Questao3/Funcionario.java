package Questao3;

public class Funcionario extends PessoaFisica {
	private String cargo;
	private double salario;

	public Funcionario() {
		super();
	}
	
	public Funcionario(String nome, int idade, char sexo, String cpf, String cargo, double salario) {
		super(nome, idade, sexo, cpf);
		this.cargo = cargo;
		this.salario = salario;
	}
	
	public String getCargo() {
		return cargo;
	}
	
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
}
