public class TesteFuncionario {
    public static void main(String[] args) {

        Gerente nico = new Gerente();
        nico.setNome("nico stepat");
        nico.setCpf("222333444-55");
        nico.setSalario(2600.00);

        System.out.println(nico.getNome());
        System.out.println(nico.getBonificacao());

    }
}