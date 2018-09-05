package fundamentos;

import javax.swing.JOptionPane;

public class Exercicio5Fundamentos {
	public static void main(String[] args) {
		String entradaBase = JOptionPane.showInputDialog("Informe o valor da base do triângulo: ");
		String entradaAltura = JOptionPane.showInputDialog("Informe o valor da altura do triângulo: ");
		
		double base = Double.parseDouble(entradaBase);
		double altura = Double.parseDouble(entradaAltura);
		
		double area = base * altura / 2;
		
		System.out.println("A área do triângulo é: " + area);
	}
}
