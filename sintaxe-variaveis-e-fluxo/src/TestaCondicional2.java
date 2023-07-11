public class TestaCondicional2 {
    public static void main(String[] args) {
        System.out.println("testando condicionais");
        int idade = 16;
        int quantidadeDePessoas = 1;
        boolean acompanhado = quantidadeDePessoas >=2;


        if (idade >= 18 && acompanhado) {
            System.out.println("voce tem mais de 18 anos");
            System.out.println("seja bem vindo");
        } else {
            System.out.println("infelizmente voce nao pode entrar");
        }

    }


}
