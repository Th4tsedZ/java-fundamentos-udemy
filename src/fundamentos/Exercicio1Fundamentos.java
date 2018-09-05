package fundamentos;

import javax.swing.JOptionPane;

public class Exercicio1Fundamentos {
	public static void main(String[] args) {
		String entradaCelsius = JOptionPane.showInputDialog("Qual a temperatura em Celsius?");
		
		double celsius = Double.parseDouble(entradaCelsius);
		
		System.out.println("Valor em Fahrenheit é " + (((celsius / 5) * 9) + 32));
	}
}
