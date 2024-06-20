package exercicios01;
import java.util.Scanner;

public class NumeroSoma {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int num1 = numero.nextInt();

        System.out.println("Digite um numero outro: ");
        int num2 = numero.nextInt();

        System.out.println("Digite um numero real: ");
        double num3 = numero.nextDouble();

        int resultado1 = (num1 * 2) * (num2/2);
        double resultado2 = (num1 * 3) + num3;
        double resultado3 = (Math.pow(num3, 3));

        System.out.println("Resultado1 " + resultado1);
        System.out.println("Resultado2 " + resultado2);
        System.out.println("Resultado3 " + resultado3);


        numero.close();
    }
    
}
