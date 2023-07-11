public class TestaValores {
    public static void main(String[] args) {
        Conta conta = new Conta(1377,2446);
        Conta conta1 = new Conta(1377,2555);

        conta.setAgencia(570);

        System.out.println(conta.getAgencia());

        System.out.println("total de contas é: "+Conta.getTotal());

    }
}
