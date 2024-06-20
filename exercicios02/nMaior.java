package exercicios02;

import java.util.Scanner;

public class nMaior {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        System.out.print("Digite o Primeiro numero: ");
        int n1 = numero.nextInt();
        System.out.print("Digite o Segundo numero: ");
        int n2 = numero.nextInt();
        System.out.print("Digite o Terceiro numero: ");
        int n3 = numero.nextInt();

        if (n1 > n2 && n1 > n3){
        System.out.println(" n1 e o Maior: " + n1);
       
        }else if (n1 == n2 || n2 == n3){
        System.out.println("Numero Invalidos");

        }else if(n2 > n1 && n2 > n3){
        System.out.println("n2 e o Maior: " + n2);
        
        }else if (n2 == n1 || n2 == n3){
        System.out.println("Numeros Invalidos:");

        }else if( n3 > n1 && n3 > n2){ 
        System.out.println("n3 e o Maior " + n3);

        }else if (n3 == n1 || n3 == n2){
        System.out.println("Numeros Invalidos:");


        numero.close();
    }
  }

}
