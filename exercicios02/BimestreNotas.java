package exercicios02;

import java.util.Scanner;

public class BimestreNotas {
    public static void main(String[] args) {
        Scanner Bn = new Scanner(System.in);

        System.out.println("Digite a nota 1: ");
        double n1 = Bn.nextDouble();
        System.out.println("Digite a nota 2: ");
        double n2 = Bn.nextDouble();
        double media = (n1 + n2) / 2;
        System.out.println("Media final e: " + media);
         if( media >= 9 && media <= 10){
         System.out.println("A - Aprovado");
         }else if(media >= 7.5 && media <= 9.0){
         System.out.println("B - Aprovado");
         }else if(media >= 6.0 && media <= 7.5){
         System.out.println("C - Aprovado");
         }else if(media >= 4.0 && media <= 6.0){
         System.out.println("D - Reprovado");
         }else if( media <= 4){
         System.out.println("E - Reprovado"); 
         }
      
        Bn.close();
    }

}
