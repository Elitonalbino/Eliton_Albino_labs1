package exercicios03;

import java.util.Scanner;

public class base {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a Base: ");
        double Base = scan.nextDouble();
        System.out.println(" Digite o expoente:");
        double expoente = scan.nextInt();

        double resultado = Base;
        for(int i=1; i<expoente; i ++){
            resultado *= Base;
            System.out.println(resultado);
        }
        scan.close();

        }
    }



