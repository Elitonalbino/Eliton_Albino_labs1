package exercicios02;

import java.util.Scanner;

public class VogalConsuante {
    public static void main(String[] args) {
        Scanner letra = new Scanner(System.in);
        System.out.println("Digite uma Letra: ");
        String L = letra.next();

        if (L.equalsIgnoreCase("a")|| 
        L.equalsIgnoreCase("e")||
        L.equalsIgnoreCase("i")|| 
        L.equalsIgnoreCase("o")||
        L.equalsIgnoreCase("u")){
        System.out.println("Vogal");

        }else if(L.length() > 1){
        System.out.println("Nao e um Letra Valida");
        
        }else{
        System.out.println("Consuante");

        letra.close();
    }

  }
}