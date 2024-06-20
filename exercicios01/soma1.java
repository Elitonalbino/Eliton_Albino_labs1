package exercicios01;
import java.util.Scanner;

public class soma1 {
    public static void main(String[] args) {
        Scanner soma = new Scanner(System.in);
        System.out.println("Digite o primero numero: ");
        int num1 = soma.nextInt();
        System.out.println("Digite o Segundo numero: ");
        int num2 = soma.nextInt();
        int resultado = num1 + num2;
        System.out.println("O resultado e: " + resultado);

        soma.close();
    }

}
