public class Administrador extends Funcionario implements Autentificavel {

    private AutenficacaoUtil util;

    public Administrador() {
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
    @Override
    public double getBonificacao() {
        return 50;
    }
}
