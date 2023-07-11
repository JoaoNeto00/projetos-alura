public class Cliente implements Autentificavel {

    private AutenficacaoUtil util;

    public Cliente() {
        this.util = new AutenficacaoUtil();
    }

    @Override
    public void setSenha(int senha) {
        this.util.setSenha(senha);
    }

    @Override
    public boolean autentifica(int senha) {
        return this.util.autentifica(senha);

    }
}