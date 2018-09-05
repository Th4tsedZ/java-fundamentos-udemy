package fundamentos;

import javax.swing.JOptionPane;

public class Exercicio4Fundamentos {
	public static void main(String[] args) {
		String entradaValor = JOptionPane.showInputDialog("Digite um valor: ");
		
		int valor = Integer.parseInt(entradaValor);
		
		System.out.println("O valor informado ao quadrado é: " + Math.pow(valor, 2));
		System.out.println("O valor informado ao cubo é: " + Math.pow(valor, 3));
	}
}
