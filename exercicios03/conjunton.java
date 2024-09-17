package exercicios03;

import java.util.Scanner;

public class conjunton {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Quantos números você vai inserir? ");
        int n = scan.nextInt();
        int[] numeros = new int[n];

        for (int i = 0; i < n; i++) {
            while (true) {
                System.out.print("Digite um número entre 0 e 1000: ");
                int num = scan.nextInt();
                if (num >= 0 && num <= 1000) {
                    numeros[i] = num;
                    break;
                } else {
                    System.out.println("Número inválido. Tente novamente.");
                }
            }
        }

        int menorValor = numeros[0];
        int maiorValor = numeros[0];
        int somaValores = 0;

        for (int num : numeros) {
            if (num < menorValor) {
                menorValor = num;
            }
            if (num > maiorValor) {
                maiorValor = num;
            }
            somaValores += num;
        }

        System.out.println("Menor valor: " + menorValor);
        System.out.println("Maior valor: " + maiorValor);
        System.out.println("Soma dos valores: " + somaValores);

        scan.close();   
    }
    
}