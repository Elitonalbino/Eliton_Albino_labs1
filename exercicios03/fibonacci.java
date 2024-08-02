package exercicios03;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
      
        System.out.println("Digite o fibonacci: ");
        int n = scan.nextInt();
        int primeiro = 1;
        int segundo = 1;
        int proximo;

        System.out.println("fibonatti: "  + primeiro);
        System.out.println("fibonatti: "  + segundo);
            

        for(int i=3; i<=n; i++){
            proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;
            System.out.println("fibonatti: "  + proximo);
            
        }
        scan.close();


    }

}
