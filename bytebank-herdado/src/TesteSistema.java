public class TesteSistema {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        gerente.setSenha(2222);

        Administrador adm = new Administrador();
        adm.setSenha(2222);

        Cliente cliente = new Cliente();
        cliente.setSenha(2222);

        SistemaInterno sistemainterno = new SistemaInterno();
        sistemainterno.autentifica(gerente);
        sistemainterno.autentifica(adm);
        sistemainterno.autentifica(cliente);

    }
}

