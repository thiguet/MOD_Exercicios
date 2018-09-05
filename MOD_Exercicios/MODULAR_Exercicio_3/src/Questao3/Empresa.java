package Questao3;

public class Empresa {
	private Cliente[] clientes;
	private Funcionario[] funcionarios;
	private Endereco endereco;
	
	public Empresa(Cliente[] clientes, Funcionario[] funcionarios) {
		this.clientes = clientes;
		this.funcionarios = funcionarios;
	}
	
	public Cliente[] getClientes() {
		return clientes;
	}
	
	public void setClientes(Cliente[] clientes) {
		this.clientes = clientes;
	}
	
	public Funcionario[] getFuncionarios() {
		return funcionarios;
	}
	
	public void setFuncionarios(Funcionario[] funcionarios) {
		this.funcionarios = funcionarios;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
}
