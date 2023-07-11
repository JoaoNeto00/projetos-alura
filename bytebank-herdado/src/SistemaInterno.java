public class SistemaInterno   {

    private int senha = 2222;

    public void autentifica(Autentificavel senha){
         boolean autentificou = senha.autentifica(this.senha);

        if (autentificou) {
            System.out.println("pode entrar no sistema ! ");
        }else {
            System.out.println(" não pode entrar no sistema ! ");
        }
    }

}
