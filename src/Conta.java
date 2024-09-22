import lombok.Getter;
import lombok.Setter;

public abstract class Conta implements IConta {
    
    private static int AGENCIA_PADRAO = 1;
    @Getter @Setter
    protected int agencia;
    @Getter @Setter
    protected int numero;
    @Getter @Setter
    protected double saldo;
    protected Cliente cliente;


    private static int SEQUENCIAL = 1;

    public Conta(Cliente cliente){
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL ++;
        this.cliente = cliente;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;        
    }
    @Override
    public void sacar(double valor) {
        saldo -= valor;        
        
    }
    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);        
    }

    protected void imprimirInfosComuns(){
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Agencia: %.2f", this.saldo));
    }


}
