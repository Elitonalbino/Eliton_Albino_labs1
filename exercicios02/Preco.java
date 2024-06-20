package exercicios02;

import java.util.Scanner;

public class Preco {
    public static void main(String[] args) {
        
        Scanner preco = new Scanner(System.in);
        System.out.print("Digite o Preço do P1: ");
        double p1 = preco.nextDouble();
        System.out.print("Digite o preço do P2: ");
        double p2 = preco.nextDouble();
        System.out.print("Digite o Preço do P3: ");
        double p3 = preco.nextDouble();

        if (p1< p2 && p1< p3){
        System.out.println("p1 e o menor preço: " + p1);
        }else if  (p2 < p1 && p2 < p3 ){
        System.out.println("p2 e menor preço: " + p2);
        }else if(p3< p2 && p3 < p1){
        System.out.println("p3 e o menor preço: " + p3);
        }else if(p1 == p2 || p2 == p3){
        System.out.println("Os Produtos estão baratos");

        preco.close();
    }
  }
}
