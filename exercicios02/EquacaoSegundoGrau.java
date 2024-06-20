package exercicios02;

import java.util.Scanner;

public class EquacaoSegundoGrau {
    public static void main(String[] args) {
        Scanner equacao = new Scanner(System.in);
        System.out.println(" Digite o Valor de a: ");
        double a = equacao.nextDouble();
        if( a == 0){
        System.out.println("A Equaçao nao e de segundo grau");
        }else{
        System.out.println("Digite o Valor de b: ");
        double b = equacao.nextDouble();
        System.out.println("Digite o valor c: ");
        double c = equacao.nextDouble();
        

        double delta = (b*b) - (4 * a * c);
       
       if (delta > 0){
       System.out.println("Delta Negativo");    
       }else{
          double x1 = ((-b) + Math.sqrt(delta)) / (2*a);
          double x2 = ((-b) - Math.sqrt(delta)) / (2*a);

          System.out.println("x1 = " + x1);
          System.out.println("x2 = " + x2);


       }
    
    }

        equacao.close();
    }

}
