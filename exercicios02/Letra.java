package exercicios02;

import java.util.Scanner;

public class Letra {
    public static void main(String[] args) {
        Scanner letra = new Scanner(System.in);
        System.out.println("Digite o sexo: M ou F");
        String L = letra.next();

        if (L.equalsIgnoreCase("M")){
        System.out.println("M - Masculino");
        }else if(L.equalsIgnoreCase("F")){
        System.out.println("F - Feminino");
        }else{
        System.out.println("sexo invalido");

        letra.close();
          

    }
  }
}
    

