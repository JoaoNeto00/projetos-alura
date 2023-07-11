package br.com.bytebank.banco.modelo;
public class SeguroDeVida implements Tributavel  {
    @Override
    public double getvalorImposto() {
        return 42;
    }
}
