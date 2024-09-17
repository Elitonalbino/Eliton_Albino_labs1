package exercicios03;

import java.util.Scanner;

public class mediaarimentica {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite qtd de notas: ");
        double qtdNotas = scan.nextDouble();
        double notas;
        double media;
        double soma = 0;
        for(int i=1; i<=qtdNotas; i++){
            System.out.println("notas: " + i);
            notas = scan.nextDouble();
            soma += notas;
        }
        media = soma / qtdNotas;
        System.out.println("Soma: " + soma);
        System.out.println("Media N e: " + media);

        scan.close();    
    }

}
