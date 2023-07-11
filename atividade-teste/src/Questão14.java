/**
 * Crie dois vetores de 50 posições com valores inteiros aleatórios, ordene cada vetor  individualmente,
 *  e combine os dois	vetores	gerando um novo	vetor de 100 posições,
 *  de   forma	que	esse	novo	vetor	já	seja	criado	ordenado.
 *
 */

import java.util.Random;
public class Questão14 {
    public static void main(String[] args) {

        Random random = new Random();
        int[] vetor1 = new int[50];
        int[] vetor2 = new int[50];
        int[] vetorUniao = new int[100];
        int contador = 0;

        for(int i = 0;i< vetor1.length;i++){

            vetor1[i] = random.nextInt(100);
            vetor2[i] = random.nextInt(100);

            vetorUniao[contador] = vetor1[i];
            contador++;
            vetorUniao[contador] = vetor2[i];
            contador++;

            System.out.print(" vetor 1 : ["+vetor1[i]+"]");
            System.out.print(" vetor 2 : ["+vetor2[i]+"]");
            System.out.println(" vetor uniao : ["+vetorUniao[i]+"]");
        }
    }
}