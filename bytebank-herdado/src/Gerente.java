
public class Gerente extends Funcionario implements Autentificavel {

    private AutenficacaoUtil util;

    public Gerente() {
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
    public double getBonificacao(){
         System.out.println("chamando bonificação do gerente");
         return super.getSalario();
    }
}

