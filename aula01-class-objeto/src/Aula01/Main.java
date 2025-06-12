package Aula01;

public class Main {
    public static void main(String[] args) {
     Conta conta1 = new Conta();

     conta1.titular = "Maria";
     conta1.numero_conta = 12345;
     conta1.saldo = 10.00;

        System.out.println("Cliente: "+ conta1.titular);
        System.out.println("Numero da conta: "+ conta1.numero_conta);
        System.out.println("Saldo da conta: "+ conta1.saldo);


        conta1.depositar();
        conta1.consultar();
        conta1.sacar();
        conta1.consultar();
    }
}