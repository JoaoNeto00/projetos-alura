public class TestaContaExccecaoChecked {
    public static void main(String[] args) {
        Conta c = new Conta();
        try {
            c.deposita();
        }catch (MinhaExcecao excecao){
            System.out.println("tratamento...");
        }



    }

}
