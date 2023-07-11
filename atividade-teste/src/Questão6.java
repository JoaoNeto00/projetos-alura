/**
 * 6. Determine o	número	de	dígitos	de	um	número	informado
 * */
import java.util.Scanner;
public class Questão6 {
    public static void main(String[] args) {
        int numero;
        int quantidadeDigito = 1;

        Scanner scanner = new Scanner (System.in);
        System.out.println("digite um numero inteiro: ");
        numero = scanner.nextInt();

        while (numero >= 10){
            numero /= 10;
            quantidadeDigito++;
        }
        System.out.println("numero de digitos: "+quantidadeDigito);
    }
}
