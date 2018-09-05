package fundamentos;

import javax.swing.JOptionPane;

public class Exercicio3Fundamentos {
	public static void main(String[] args) {
		String entradaPeso = JOptionPane.showInputDialog("Informe o seu peso: ");
		String entradaAltura = JOptionPane.showInputDialog("Informe a sua altura: ");
		
		double peso = Double.parseDouble(entradaPeso);
		double altura = Double.parseDouble(entradaAltura);
		
		double imc = peso / Math.pow(altura, 2);
		
		System.out.printf("O seu IMC é de: %.2f %n", imc);
	}
}
