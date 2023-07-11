import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class Main {
    public static void main(String[] args) {

        Conta conta = new ContaCorrente(123,456);

        conta.deposita(200);

        System.out.println(conta.getSaldo());

    }
}