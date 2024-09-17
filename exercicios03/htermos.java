package exercicios03;

import java.util.Scanner;

public class htermos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor de H: ");
         int h = scan.nextInt();
          int soma = 0;
          for(int i = 1; i<=h; i++){
            soma += 1/i;
          }
         System.out.println("Soma: " + soma);
         scan.close();
    }

}
