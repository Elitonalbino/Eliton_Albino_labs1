package exercicios02;

import java.util.Scanner;

public class NumeroNegativo {
    public static void main(String[] args) {
         Scanner negativo = new Scanner(System.in);

         System.out.print("Digite um numero: ");
        

        int numN = negativo.nextInt();
         
         if (numN < 0){
         System.out.println("Ele e negativo");
         }else{
         System.out.println("e positivo");

         negativo.close();
    }
  }
}
