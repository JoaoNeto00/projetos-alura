public class TestaMetodo {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.saldo = 100;
        conta.deposita(50);
        System.out.println(conta.saldo);

        conta.saca(20);
        System.out.println(conta.saldo);

        Conta conta1 = new Conta();
        conta1.deposita(1000);

        conta1.transfere(300,conta);
        System.out.println("conta: "+conta.saldo);
        System.out.println("conta1: "+conta1.saldo);



    }
}
