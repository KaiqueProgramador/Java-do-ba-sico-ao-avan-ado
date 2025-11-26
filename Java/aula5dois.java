public class aula5dois {
    String nome;

    aula5dois (String nome) {
        this.nome = nome;
    }

    public static void main(String[] args) {
        aula5dois p = new aula5dois("Ana");
        System.out.println(p.nome);
    }
}
