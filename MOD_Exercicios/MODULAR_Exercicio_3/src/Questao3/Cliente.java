package Questao3;

public class Cliente extends Pessoa {
	private double limiteCredito;

	public Cliente() {
		super();
	}

	public Cliente(String nome, int idade, char sexo, double limiteCredito) {
		super(nome, idade, sexo);
		this.limiteCredito = limiteCredito;
	}

	public double getLimiteCredito() {
		return limiteCredito;
	}

	public void setLimiteCredito(double limiteCredito) {
		this.limiteCredito = limiteCredito;
	}
	
	
}
