package exercicios03;

import java.util.Scanner;

public class populacao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a População A: ");
        int popA = scan.nextInt();
        System.out.println("Digite a Populaçao B: ");
        int popB = scan.nextInt();
        int cont = 0;
        while (popA < popB) {
            popA +=( popA / 100) * 3;
            popB +=(popB / 100) * 1.5;
            cont++;
            System.out.println("PopA: " + popA);
            System.out.println("PopB: " + popB);
            System.out.println("Qtd anos: " + cont);
            
        }
        scan.close();

    }

}
