public class Main {

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNome("Andrezza");
        Conta cc = new ContaCorrente(cliente);
        Conta cp = new ContaPoupanca(cliente);
        cc.imprimirExtrato();
        cp.imprimirExtrato();

    }
}