import java.util.ArrayList;
public class aula4 {

    public static int somar(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        int[] numeros = { 10, 20, 30 };
        System.out.println(numeros[1]);

        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Ana");
        nomes.add("Carlos");
        System.out.println(nomes.size());

        System.out.println(somar(10, 5));
    }
}