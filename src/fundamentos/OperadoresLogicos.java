package fundamentos;

public class OperadoresLogicos {
	public static void main(String[] args) {
		boolean executouTrabalho1 = false;
		boolean executouTrabalho2 = true;
		boolean comprouSorvete = executouTrabalho1 || executouTrabalho2;
		boolean comprouTv50 = executouTrabalho1 && executouTrabalho2;
		boolean comprouTv32 = executouTrabalho1 ^ executouTrabalho2;
		
		System.out.println("Sorvete = " + comprouSorvete);
		System.out.println("Tv 50 polegadas = " + comprouTv50);
		System.out.println("Tv 32 polegadas = " + comprouTv32);
		
		//  Operador unário intruso
		System.out.println("Fome = " + !comprouSorvete);
	}
}
