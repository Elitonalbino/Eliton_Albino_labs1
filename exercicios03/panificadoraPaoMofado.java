package exercicios03;

import java.util.Scanner;

public class panificadoraPaoMofado {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Preço do Pâo: 0.18");
        System.out.println("Panificadora Pao Mofado Tabela: ");
        for(int i=1; i<=50; i++){
            System.out.println(i + "- R$: " + (0.18*i));
        }
        scan.close();
    }

}
