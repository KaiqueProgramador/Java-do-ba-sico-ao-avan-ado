import java.util.Scanner;

public class aula2 {
    public static void main(String[] args) {
        int idade = 20;
        double salario = 2500.50;
        boolean ativo = true;
        char letra = 'A';
        System.out.println(idade);

        String nome = "Maria";

        int soma = 10 + 5;
        double total = soma * 2.5;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome2 = sc.nextLine();
        System.out.println("Olá, " + nome2);
        sc.close();
    }
}