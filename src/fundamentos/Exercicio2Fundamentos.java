package fundamentos;

import javax.swing.JOptionPane;

public class Exercicio2Fundamentos {
	public static void main(String[] args) {
		String entradaFahrenheit = JOptionPane.showInputDialog("Informe os graus (º) em Fahrenheit: ");
		
		double fahrenheit = Double.parseDouble(entradaFahrenheit);
		
		System.out.println("Valor em Celsius é " + ((fahrenheit - 32) / 18000) * 10000);
	}
}
