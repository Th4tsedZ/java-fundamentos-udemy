package api;

public class ExplorandoStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("João");
        sb.append(", ").append("Maria");
        sb.append(", ").append("Pedro");

        System.out.println(sb.toString());
        System.out.println(sb.substring(0, 5));
    }
}
