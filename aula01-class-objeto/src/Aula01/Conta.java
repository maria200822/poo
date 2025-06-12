package Aula01;

public class Conta{
    String titular;
    Integer numero_conta;
    Double saldo;
    void sacar () {
        System.out.println("vocé esta fazendo um saque");
        this.saldo = this.saldo - 25;
    }

    void depositar () {
        this.saldo = this.saldo + 50;

    }

    void consultar () {
        System.out.println("Saldo R$ "+ this.saldo);

    }

    }
