package fundamentos;

public class VariaveisEConstantes {
	public static void main(String[] args) {
		double raioCircunferencia = 4.5;
		final double PI = 3.1416;
		double area = PI * raioCircunferencia * raioCircunferencia;
		System.out.println("A área é " + area + " m2.");
		System.out.printf("A área é %f m2. \n", area);
		System.out.printf("A área E %.2f m2. ", area);
	}
}
