
public class Carro {
	
	protected int velocidade;
	protected String cor;
	protected double preco;
	
	Carro() {}
	
	Carro(int velocidade, String cor, double preco) {
		this.velocidade = velocidade;
		this.cor = cor;
		this.preco = preco;
	}
	
	public String identity() {
		return "� um carro.";
	}
	
	@Override
	public String toString() {
		return this.identity() + "\nA velocidade m�xima � : " + this.velocidade + " km/h \n" +
			   "A cor � : " + this.cor + "\n" +
			   "O pre�o � : R$ " + this.getPrecoVenda();
	}
	
	public double getPrecoVenda() {
		return this.preco;
	}
	
}
