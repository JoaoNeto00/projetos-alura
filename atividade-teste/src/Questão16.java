
/**
 * 16. Leia	 do	 usuário	 o	 tempo	 em	 segundos	 e	 escreva	 em	 horas,	 minutos	 e	 segundos.	 Utilize
 * cinco	 métodos,	 para	 a	 leitura	 e	 escrita	 de	 dados	 e	 para	 obtenção	 de	 horas,	 minutos	 e
 * segundos	a	partir	do	tempo	em	segundos.
 * */
// 1min - 60s / 1hr - 60min / 1hr - 3.600s
public class Questão16 {

    public static void main(String[] args) {
        ConversorDeSegundos conversor = new ConversorDeSegundos();

        conversor.leituraDeDados();
        conversor.calculoHoras();
        conversor.calculoMinutoss();
        conversor.escritaDeDados();

    }
}
