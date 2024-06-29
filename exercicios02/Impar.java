package exercicios02;

import java.util.Scanner;

public class Impar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o num 1: ");
        int num1 = scan.nextInt();
        System.out.println("Digite o num2: ");
        int num2 = scan.nextInt();
        System.out.println("Digite a operaçao: + - / * ");
        String operçao = scan.next();
        double resultado = 0;
        boolean valida = true; 

        switch (operçao) {
            case "+": resultado = num1 + num2;break;
            case "-": resultado = num1 - num2; break;
            case "/": resultado = num1 / num2; break;
            case "*": resultado = num1 * num2; break;
        
            default: System.out.println("Operaçao invalida"); valida = false;

            System.out.println("resultado: " + resultado);

        }
        if(valida){
            if (resultado >=0){
                System.out.println("Resultado Positivo");

            }else{
                System.out.println("Resultado negativo");
            }
            if( resultado % 2 == 0);
            System.out.println("O numero e Par");
        }else{
            System.out.println("Numero e impar");
        }


        scan.close();
    }

}
