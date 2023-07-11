package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.*;

public class TesteSaca {

    public static void main(String[] args) {
        Conta conta = new ContaCorrente(132,222);
        conta.deposita(200);

        conta.saca(210);

        System.out.println(conta.getSaldo());
    }
}
