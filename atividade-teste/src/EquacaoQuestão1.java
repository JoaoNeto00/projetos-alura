public class EquacaoQuestão1 {
    double a = 0;
    double b = 0;
    double c = 0;
    public void calculoDaEquacao(double a,double b, double c){
        double delta = (b*b) - 4*a*c;

        double raizPositiva = (-b + Math.sqrt(delta)) / (2 * a);

        double raiznegativa = (-b - Math.sqrt(delta)) / (2 * a);

        System.out.println("raiz positiva = "+raizPositiva);
        System.out.println("raiz negativa = "+raiznegativa);
    }
}
