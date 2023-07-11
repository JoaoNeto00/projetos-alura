/**
 * Calcule a	série	de	Fibonacci	para	um	número	inteiro	não	negativo	informado	pelo	usuário. A série de Fibonacci inicia com os números F0 = 0 e F1 = 1, e cada número posterior equivale	à	soma	dos	dois	números	anteriores (Fn =	Fn-1 +	Fn-2).	Por	exemplo,	caso	o	usuário
 * informe	o	número	9,	o	resultado	seria:	0,	1,	1,	2,	3,	5,	8,	13,	21,	34.
 *
 *
 * */

public class Questão8 {
    public static void main(String[] args) {
        int f0 = 0,f1 = 1;
        int aux;
        int numeroUsuario = 9;

        System.out.println(f0);
        for ( int i =0; i <= numeroUsuario; i++) {
            System.out.println(f1);
            aux = f1;
            f1 += f0;
            f0 = aux;
        }
    }
}

