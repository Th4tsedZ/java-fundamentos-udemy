package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {
	public static void main(String[] args) {
		String resposta1 = JOptionPane.showInputDialog("Qual é a nota 1?");
		String resposta2 = JOptionPane.showInputDialog("Qual é a nota 2?");
		
		// Converter string em double
		double nota1 = Double.parseDouble(resposta1);
		double nota2 = Double.parseDouble(resposta2);
		System.out.println((nota1 + nota2)/2);
	}
}
