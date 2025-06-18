package Aula02;

public class Main {
    public static void main(String[] args) {
        Conta minhaConta = new Conta( "aparecida", 445, 0.0);
        minhaConta.consultarSaldo();
        minhaConta.depositar(4.0);
        minhaConta.consultarSaldo();
        minhaConta.sacar(1.5);
        minhaConta.consultarSaldo();
    }
}
