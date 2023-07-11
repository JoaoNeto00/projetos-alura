/**
 * Para	 cada	 produto	 informado	 (nome,	 preço	 e	 quantidade),	 escreva	 o	 nome	 do	 produto
 * comprado	 e	 o	 valor	 total	 a	 ser	 pago,	 considerando	 que	 são	 oferecidos	 descontos	 pelo
 * número	de	unidades	compradas,	segundo	a	tabela	abaixo:
 *
 * a. Até	10	unidades: valor	total
 * b. de	11 a	20	unidades: 10%	de	desconto
 * c. de	21	a	50	unidades: 20%	de	desconto
 * d. acima	de	50	unidades: 25%	de	desconto
 * */

public class Questão4 {
    public static void main(String[] args) {
        Loja cliente = new Loja("corote",10,10);
        System.out.println("----------------");
        cliente.mostrarCompra();
    }
}
