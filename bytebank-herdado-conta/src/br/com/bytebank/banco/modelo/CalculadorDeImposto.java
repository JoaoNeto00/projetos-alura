package br.com.bytebank.banco.modelo;

//  br.com.bytebank.banco.modelo  => FULL QUALIFY NAME
public class CalculadorDeImposto {

    private double totalImposto;

    public void registra(Tributavel tributavel){
        double valor = tributavel.getvalorImposto();
        this.totalImposto += valor;
    }

    public double getTotalImposto() {
        return totalImposto;
    }
}
