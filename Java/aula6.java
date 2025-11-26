public class aula6 {
    void falar() {
        System.out.println("Animal falando...");
    }

    static class Cachorro extends aula6 {
        void falar() {
            System.out.println("Au au");
        }
    }

    public static void main(String[] args) {
        aula6 a = new Cachorro();
        a.falar();
    }
}
