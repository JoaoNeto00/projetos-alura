public class Distancia {
    int x1 = 0 ,y1 = 0;
    int x2 = 0,y2 = 0;

    public void resultadoDistancia(double x1,double y1,double x2,double y2){
        double resultado =Math.pow(x1-x2,2) + Math.pow(y1-y2,2);
        double distancia = Math.sqrt(resultado);

        System.out.println("distancia é: "+distancia);

    }
}
