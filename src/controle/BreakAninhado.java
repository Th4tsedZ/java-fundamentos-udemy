package controle;

public class BreakAninhado {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; i < 5; i++) {
                if (j == 3) {
                    break;
                }
                System.out.println(i + " " + j);
            }
        }
        System.out.println("Fim!");
    }
}
