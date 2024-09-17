package exercicios03;

import java.util.Scanner;

public class lojajoao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lojas quase 2 - Tabela de Preços:");
        for(int i=1; i<=50; i++){
            System.out.println(i + " - R$ " + 1.99 * i);
        }
        scan.close();
    }

}
