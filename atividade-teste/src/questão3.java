

import java.util.Scanner;
public class questão3 {
        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);
            double x1, y1, x2, y2, distancia;

            System.out.println("Entre com as coordenadas x e y dos pontos nesta ordem:");
            x1 = teclado.nextFloat();
            y1 = teclado.nextFloat();
            x2 = teclado.nextFloat();
            y2 = teclado.nextFloat();

            distancia = Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2));
            System.out.println("A distância é: " + distancia);
        }
}
//-7,6,5,-3