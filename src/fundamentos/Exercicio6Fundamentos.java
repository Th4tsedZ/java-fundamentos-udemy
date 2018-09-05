package fundamentos;

import javax.swing.JOptionPane;

public class Exercicio6Fundamentos {
	public static void main(String[] args) {
		String entradaA = JOptionPane.showInputDialog("Informe o valor de A: ");
		String entradaB = JOptionPane.showInputDialog("Informe o valor de B: ");
		String entradaC = JOptionPane.showInputDialog("Informe o valor de C: ");
		
		int a = Integer.parseInt(entradaA);
		int b = Integer.parseInt(entradaB);
		int c = Integer.parseInt(entradaC);
		
		double delta = Math.pow(b, 2) - 4 * a * c;

		double xPositivo = (-b + Math.sqrt(delta)) / (2 * a);
		double xNegativo = (-b - Math.sqrt(delta)) / (2 * a);
		
		System.out.printf("A equação ficou da seguinte forma: %dx² + %dx + %d = 0 %n", a, b, c);
		System.out.printf("O delta desta equação é %.0f e suas raizes são %.0f e %.0f%n", delta, xPositivo, xNegativo);
	}
}
