package org.example;

public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta();

        conta.titular = "crisey";
        conta.numero = 1234;
        conta.agencia = "Maze Bank";
        conta.saldo = 2000;
        conta.dataAbertura = "20/05/2010";

        conta.exibirConta();
        System.out.println();

        conta.sacar(500);
        System.out.println("SALDO R$" + conta.saldo);
        System.out.println();

        conta.depositar(500);
        System.out.println("SALDO R$" + conta.saldo);
        System.out.println();

        conta.rendimento();
        System.out.println("SALDO R$" + conta.saldo);
        System.out.println();
    }
}