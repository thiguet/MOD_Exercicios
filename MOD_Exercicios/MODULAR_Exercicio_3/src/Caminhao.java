
public class Caminhao extends Carro {
	private int carga;
	
	Caminhao() {
		super();
	}
	
	Caminhao(int carga) {
		super();
		this.carga = carga;
	}
	
	Caminhao(int velocidade, String cor, double preco, int carga) {
		super(velocidade, cor, preco);
		this.carga = carga;
	}
	
	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}

	@Override
	public double getPrecoVenda() {
		return this.carga > 2000 
				? super.getPrecoVenda() * 0.9
				: super.getPrecoVenda() * 0.8;
	}
	@Override
	public String identity() {
		return "É um caminhão.";
	}
	
	@Override
	public String toString() {
		return super.toString() + "\n A carga recomendada é : " + this.carga + " kg";
	}
}
