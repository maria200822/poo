package Aula02;

public class Conta {
    private String nomeTitular;
    private Integer numeroConta;
    private Double saldo;

    public Conta(String nomeTitular , Integer numeroConta, Double saldo){
        this.nomeTitular = nomeTitular;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public void consultarSaldo(){
        System.out.printf("Saldo da Conta: R$ %.2f \n", this.saldo);
    }
    public void depositar(Double valor){
        this.saldo = this.saldo + valor;
    }
    public String sacar(Double valor){
        this.saldo = this.saldo - valor;
        return "Saque realizado com sucesso!!";
    }
}