package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.*;

public class TesteConta {
    public static void main (String [] args){

        ContaCorrente contaCorrente = new ContaCorrente(111,111);
        contaCorrente.deposita(100.0);

        ContaPoupanca contaPoupanca = new ContaPoupanca(222,222);
        contaPoupanca.deposita(200.0);

        contaCorrente.transfere(10.0,contaPoupanca);

        System.out.println("conta corrente - - "+contaCorrente.getSaldo());
        System.out.println("conta poupança - - "+contaPoupanca.getSaldo());

    }
}
