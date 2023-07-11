import java.util.Scanner;

public class ConversorDeSegundos {

    private double leituraEmSegundos;
    private double leituraEmMinutos;
    private double leituraEmHoras;

    public void leituraDeDados(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite o tempo em segundos: ");
        this.leituraEmSegundos = scanner.nextDouble();
    }
    public void escritaDeDados(){
        System.out.println(leituraEmHoras+" horas ");
        System.out.println(leituraEmMinutos+" minutos ");
        System.out.println(this.leituraEmSegundos+" segundos ");
    }
    public void calculoHoras(){
        leituraEmHoras = (this.leituraEmSegundos / 60) / 60;
    }
    public void calculoMinutoss(){
        leituraEmMinutos  = this.leituraEmSegundos / 60;
    }
    public double calculoSegundos(){
        return this.leituraEmSegundos;
    }
}
