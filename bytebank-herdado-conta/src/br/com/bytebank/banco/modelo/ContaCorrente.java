package br.com.bytebank.banco.modelo;

public class ContaCorrente extends Conta implements Tributavel {

    @Override
    public void deposita(double valor) {
        super.saldo += valor;
    }

    public ContaCorrente(int agencia, int numero){
        super(agencia, numero);
    }

    @Override
    public void saca(double valor) {
        double valorASacar = valor + 0.2;
        super.saca(valorASacar);

    }

    @Override
    public double getvalorImposto() {
        return super.saldo * 0.01;
    }
}
