//nao pode instanciar essa classe , pq e abstract
public abstract class Funcionario {

    private String nome;
    private String cpf;
    private double salario;

    //filhos precisam implementar
     public  abstract double getBonificacao(); // metado sem corpo, sem implementacao


    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
