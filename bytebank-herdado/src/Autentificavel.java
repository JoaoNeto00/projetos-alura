

// contrato autentificavel;
    //quem assinar esse contrato, precisa implementar;
        // metodo senha;
        //metado autentifica;
public abstract interface Autentificavel {
    public abstract void setSenha(int senha);
    public abstract boolean autentifica(int senha);
}
