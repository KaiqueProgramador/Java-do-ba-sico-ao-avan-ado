public class aula5tres {
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public static void main(String[] args) {
        aula5tres c = new aula5tres();
        c.depositar(100);
        System.out.println(c.getSaldo());
    }
}
