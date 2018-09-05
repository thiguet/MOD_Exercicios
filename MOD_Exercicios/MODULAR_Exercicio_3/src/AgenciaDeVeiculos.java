import javax.swing.JOptionPane;

public class AgenciaDeVeiculos {
	public static void main(String args[]) {
		Carro car = new Carro (220, "Marrom", 20000.0);

		Carro caminhao = new Caminhao (250, "Amarelo", 190000.0, 4000);

		Carro fiat = new Fiat (300, "Verde", 20000.0, 5);
		
		Carro sedan = new Sedan (120, "Preto", 30000.0, 40);

		JOptionPane.showMessageDialog(null, car.toString());
		
		JOptionPane.showMessageDialog(null, caminhao.toString());
		
		JOptionPane.showMessageDialog(null, fiat.toString());
		
		JOptionPane.showMessageDialog(null, sedan.toString());
	}
}
