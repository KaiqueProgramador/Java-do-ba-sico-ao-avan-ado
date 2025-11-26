public class aula5 {
    String nome;
    int idade;

    void apresentar() {
        System.out.println("Olá, eu sou: " + nome);
    }
    public static void main(String[] args) {
        aula5 P = new aula5();
        P.nome = "João";
        P.idade = 25;
        P.apresentar();
    }
}
