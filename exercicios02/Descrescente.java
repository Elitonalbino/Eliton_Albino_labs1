package exercicios02;

import java.util.Scanner;

public class Descrescente {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        System.out.println("Digite o Primeiro numero: ");
        int n1 = numero.nextInt();
        System.out.println("Digite o Segundo numero: ");
        int n2 = numero.nextInt();
        System.out.println("Digite o numero Terceiro numero: ");
        int n3 = numero.nextInt();

        if( n1 < n2 && n1 < n3 && n2 < n3){
        System.out.println(n3 + "-" + n2 + "-" + n1);
        }else if( n1 < n2 && n1 < n3 && n3 < n2){
        System.out.println(n2 + "-" + n3 + "-" + n1);

        }else if(n2 < n1 && n2 < n3 && n1 < n3){
        System.out.println(n3 + "-" + n1 + "-"  + n2 );
        }else if (n2 < n1 && n2 < n3 && n3 < n1){
        System.out.println(n1 +"-" + n3 +  "-" + n2);
        
        }else if(n3 < n1 && n3 < n2 && n1 < n2){
        System.out.println(n2 + "-" + n1 + "-" + n3);
        }else if(n3 < n1 && n3 < n2 && n2 < n1){
        System.out.println(n1 +"-" + n2 + "-" + n3);
        }
        numero.close();

        
    }
}
