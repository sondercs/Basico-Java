public class TesteContaBancaria {
    public static void main(String[] args) {
        ContaBancaria contaBancaria1 = new ContaBancaria();
        contaBancaria1.setNumero("123");
        contaBancaria1.setTitular("João Pedro");

        contaBancaria1.depositar(150);
        contaBancaria1.sacar(100);
    }
}
