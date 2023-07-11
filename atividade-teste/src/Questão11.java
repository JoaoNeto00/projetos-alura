import java.util.Scanner;
/**
 * Calcule a raiz quadrada aproximada de um número inteiro informado pelo usuário, respeitando o erro máximo também informado pelo usuário. Não utilize funções predefinidas.
 * */

public class Questão11 {
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);

        System.out.println("digite o numero: ");
        int numeroUsuario = scan.nextInt();

        //System.out.println(Math.sqrt(numeroUsuario));
        System.out.println(Math.round(Math.sqrt(numeroUsuario)));

    }
}
