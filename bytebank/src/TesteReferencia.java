public class TesteReferencia {
    /***
     * a variavel primeiraConta não guarda o objeto, mas o endereço de memoria onde esta o objeto
     * portanto é uma referencia ao objeto;
     *
     */

    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 300;

        System.out.println("saldo da primeira: "+primeiraConta.saldo);

        Conta segundaConta = primeiraConta; // foi passado o endereço de memoria para a segundaConta e não o objeto

        System.out.println("saldo da segunda: "+ segundaConta.saldo);

        segundaConta.saldo += 100;
        System.out.println("saldo da SEGUNDA: "+segundaConta.saldo);

        System.out.println("saldo da PRIMEIRA: "+primeiraConta.saldo);

        if(primeiraConta == segundaConta){
            System.out.println("contas iguais");
        }else {
            System.out.println("contas diferentes");
        }
    }
}
