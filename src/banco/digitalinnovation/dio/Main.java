package banco.digitalinnovation.dio;

public class Main {

    public static void main(String[] args){

        Conta cc = new ContaCorrente();
        Conta poupanca = new ContaPoupanca();

        cc.depositar(100);
        poupanca.depositar(50);

       ((ContaCorrente) cc).imprimirExtrato();
        ((ContaPoupanca) poupanca).imprimirExtrato();

    }
}
