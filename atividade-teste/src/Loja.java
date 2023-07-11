public class Loja {
    private String nome;
    private double preco;
    private int quantidade;

    public Loja(String nome,double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        contaTotal(quantidade,preco);
    }
    public void mostrarCompra(){
        System.out.println("nome: "+getNome());
        System.out.println("preco: "+getPreco());
        System.out.println("quantidade: "+getQuantidade());
    }
    public void contaTotal(int quantidade,double preco){
        double valorCalculo = preco * quantidade;
        double valorTotal = 0;
        if (quantidade<=10) {
            valorTotal = valorCalculo;
        } else if (quantidade>=11 && quantidade<=20) {
            valorTotal =valorCalculo - (valorCalculo * 0.10);
        } else if (quantidade>=21 && quantidade<=50) {
            valorTotal =valorCalculo - (valorCalculo * 0.20);
        } else {
            valorTotal =valorCalculo - (valorCalculo * 0.25);
        }
        System.out.println("nome do produto: "+getNome());
        System.out.println("valor total a pagar: "+valorTotal);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
