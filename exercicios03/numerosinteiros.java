package exercicios03;

import java.util.Scanner;

public class numerosinteiros {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Entre com o num1: ");
        int num1 = scan.nextInt();
        
        System.out.println("Entre com num2: ");
        int num2 = scan.nextInt();
        int soma = 0;


       for(int i=num1; i<=num2; i++){
        soma +=i;
        scan.close();
       }
       System.out.println("Soma " + soma);
        
       


    }

}
