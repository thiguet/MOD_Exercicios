
public class Sedan extends Carro {
	private int comprimento;
	
	Sedan() {
		super();
	}
	
	Sedan(int comprimento) {
		super();
		this.comprimento = comprimento;
	}
	
	Sedan(int velocidade, String cor, double preco, int comprimento) {
		super(velocidade, cor, preco);
		this.comprimento = comprimento;
	}
	
	public int getComprimento() {
		return comprimento;
	}

	public void setComprimento(int comprimento) {
		this.comprimento = comprimento;
	}

	@Override
	public double getPrecoVenda() {
		return this.comprimento > 6 
					? super.getPrecoVenda() * 0.95
					: super.getPrecoVenda() * 0.9;
	}
	
	public String identity() {
		return "É um Sedan.";
	}

	@Override
	public String toString() {
		return super.toString() + "\n O comprimento é : " + this.comprimento + " metros";
	}
	
}
