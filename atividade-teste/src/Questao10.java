
/**
 * Calcule o	retorno	de	um	investimento	financeiro fazendo	as	contas	mês	a mês,	sem	usar	a fórmula de juros compostos. O usuário deve informar quanto será investido por mês e    qual	será	a	taxa	de	juros	mensal.	O	programa	deve	informar	o	saldo	do	investimento	após um	ano	(soma	das	aplicações	mês	a	mês considerando	os juros	compostos),	e	perguntar	ao usuário se ele deseja que seja calculado o ano seguinte, sucessivamente. Por exemplo, caso	o	usuário	deseje	investir	R$	100,00	por	mês,	e	tenha	uma	taxa	de	juros	de	1%	ao	mês,
 * o	programa	forneceria	a	seguinte	saída:Saldo do investimento após 1 ano: 1280.9328043328942
 * Deseja processar mais um ano? (S/N)
 * */
//M = C (1+i)t
import java.util.Scanner;
public class Questao10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double renda = 0;
        int resposta  = 1 ;

        System.out.println("quanto sera investido: ");
        double quantoInvestido = scanner.nextInt();
        System.out.println("digite a taxa de juros do mês: ");
        double taxaJurosMensal = scanner.nextInt();
        taxaJurosMensal = taxaJurosMensal / 100;

        while (resposta == 1 ) {

            for (int i = 0; i <= 12; i++) {
                renda = renda + renda * taxaJurosMensal + quantoInvestido;
            }
            System.out.println("renda do ano: " + renda);

            System.out.print("Deseja processar mais um ano? (1 - sim /0 - não) ");
            resposta = scanner.nextInt();

            if (resposta == 0){
                System.out.println("saiu do programa...");
                break;
            }
        }
    }
}
