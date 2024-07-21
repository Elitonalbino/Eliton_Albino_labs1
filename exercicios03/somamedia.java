package exercicios03;

import java.util.Scanner;

public class somamedia {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         int num;
         int soma = 0;
         double media;
         
         for(int i=0; i <5; i++){
           
         System.out.println("Digite os Numeros: ");
         num =scan.nextInt();
         soma += num;
         
         }
         media = soma / 5;
         System.out.println("soma: " + soma);
         System.out.println("media " + media);
         scan.close();
         
        }      
}
    

