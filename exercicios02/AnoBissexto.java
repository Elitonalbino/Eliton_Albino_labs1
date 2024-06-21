package exercicios02;

import java.util.Scanner;

public class AnoBissexto {
    public static void main(String[] args) {
        Scanner bissexto = new Scanner(System.in);
        System.out.println("Digite o ano: ");
        int ano = bissexto.nextInt(); 
      
        
        if(ano % 400 == 0 || ano %4 == 0 && ano % 100 != 0 ){
        
            System.out.println( ano +" E ano Bissexto");
        }else{
            System.out.println(" Não e ano bissexto");

            }
          
         bissexto.close();
    }
}

