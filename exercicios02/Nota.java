package exercicios02;

import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
         Scanner nota = new Scanner(System.in);

         System.out.println("Digite Primera nota");
         double nota1 = nota.nextDouble();
         System.out.println("Digite a Nota 2: ");
         double nota2 = nota.nextDouble();

          double Media = (nota1 + nota2) / 2;
          System.out.println("Media e: " + Media);

          if (Media == 10){
          System.out.println("Aprovado com Distisão");
          }else if (Media >= 7){
          System.out.println("Aprovado");
          }else{
          System.out.println("Reprovado");

           nota.close();

    }
  }
}
