public class TestaReferencia {
    public static void main(String[] args) {
        Gerente g1 = new Gerente();
        g1.setSalario(5000.0);


        Desinger g2 = new Desinger();
        g2.setSalario(2000.0);

        ControleBonificacao controle = new ControleBonificacao();
        controle.registra(g1);
        controle.registra(g2);

        System.out.println(controle.getSoma());
    }
}
