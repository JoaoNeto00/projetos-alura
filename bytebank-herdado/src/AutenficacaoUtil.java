public class AutenficacaoUtil {

    private int senha;


    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean autentifica(int senha) {
        if(this.senha == senha){
            return true;
        }
        return false;
    }

}
