abstract class aula6dois {
    abstract double area();

    static class Quadrado extends aula6dois {
        double lado;

        Quadrado (double lado) {
            this.lado = lado;
        }

        double area() {
            return lado * lado;
        }
    }

    public static void main(String[] args) {
        aula6dois q = new Quadrado(4);
        System.out.println(q.area());
    }
}