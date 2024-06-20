package exercicios01;
import java.util.Scanner;

public class CalculadoQuadrado {
    public static void main(String[] args) {
        Scanner quadrado = new Scanner(System.in);
        System.out.println("Digite a altura do quadrado: ");
        double AlturaQuadrado = quadrado.nextDouble();
        System.out.println("Altura e: " + AlturaQuadrado);

        System.out.println("Digite a Largura do quadrado: " );
        double LarguraQuadrado = quadrado.nextDouble();
        System.out.println("A Lagura e: " + LarguraQuadrado);

        double Area = AlturaQuadrado * LarguraQuadrado;
        System.out.println("Area e: " + Area + " m²");

        double DobroArea = AlturaQuadrado * AlturaQuadrado * 2;
        System.out.println("Dobro do Quadrado e: " + DobroArea + " m²"); 

        quadrado.close();
    }

}
