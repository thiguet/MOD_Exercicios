
public class Fiat extends Carro {
	private int descDeFabrica;
	
	Fiat() {
		super();
	}
	
	Fiat(int descDeFabrica) {
		super();
		this.descDeFabrica = descDeFabrica;
	}
	
	Fiat(int velocidade, String cor, double preco, int descDeFabrica) {
		super(velocidade, cor, preco);
		this.descDeFabrica = descDeFabrica;
	}
	
	public int getDescDeFabrica() {
		return descDeFabrica;
	}

	public void setDescDeFabrica(int descDeFabrica) {
		this.descDeFabrica = descDeFabrica;
	}

	@Override
	public double getPrecoVenda() {
		return super.getPrecoVenda() * (1.00 - ((this.descDeFabrica* 1.0) / 100.0));
	}
	
	@Override
	public String identity() {
		return "É um carro da Fiat.";
	}
	
	@Override
	public String toString() {
		return super.toString() + "\n O desconto de fábrica é : " + this.descDeFabrica + "%";
	}
}
