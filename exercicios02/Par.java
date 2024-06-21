package exercicios02;

import java.util.Scanner;

public class Par {
    public static void main(String[] args) {
        Scanner par = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int num1 = par.nextInt();

        if(num1 % 2 == 0){
        System.out.println("Numero e par");
        }else{
            System.out.println("O numero e impar");

        par.close();
    }
   }
 }
