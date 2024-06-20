package exercicios02;

import java.util.Scanner;

public class NumeroMaior {

    public static void main(String[] args) {
        Scanner maior = new Scanner(System.in);
        
        System.out.print("Digite um Numero: ");
        int num1 = maior.nextInt();
        System.out.print("Digite outro Numero: ");
        int num2 = maior.nextInt();

        if (num1 > num2){
        System.out.println("Numero 1 e Maior = " + num1);
        }else{
        System.out.println("Numero 2 e Maior = " + num2);
        
        maior.close();
        
    }
  }
}
