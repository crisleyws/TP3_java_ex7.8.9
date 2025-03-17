package org.example;

public class Conta {
    String titular;
    int numero;
    String agencia;
    double saldo;
    String dataAbertura;

    void sacar(double ValorDeSaque){
        saldo = saldo - ValorDeSaque;
    }

    void depositar(double ValorDeDeposito){
        saldo = saldo + ValorDeDeposito;
    }

    void rendimento(){
        saldo = saldo * 0.1;
    }

    void exibirConta(){
        System.out.println("Titular: " + titular);
        System.out.println("Numero: " + numero);
        System.out.println("Agencia: " + agencia);
        System.out.println("Saldo: " + saldo);
        System.out.println("Data Abertura: " + dataAbertura);
    }
}
