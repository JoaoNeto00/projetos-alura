import java.util.Random;

public class Questão13 {
    public static void main(String[] args) {
       Random gerador = new Random();
       int [] numeros = new int[100];
       for (int i = 0; i< numeros.length;i++){
           int recebeNumero = gerador.nextInt(26);
            numeros [recebeNumero] = recebeNumero;

           System.out.println(numeros[recebeNumero]);
       }
    }
}
