package exercicios03;

import java.util.Scanner;

public class cds {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Quantidade de cds: ");
        int qtdCds = scan.nextInt();
        double preco;
        double soma = 0;
        for(int i=1; i <=qtdCds; i++){
            System.out.println("Quantidade cds: " + i);
            preco = scan.nextDouble();
            soma += preco;
        }
        double media = soma / qtdCds;
        System.out.println("Media: " + media);
        scan.close();
    }
    

}
