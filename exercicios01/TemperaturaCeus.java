package exercicios01;
import java.util.Scanner;

public class TemperaturaCeus {
    public static void main(String[] args) {
        Scanner Ceusius = new Scanner(System.in);

        System.out.print("Digite Temperatura em Graus Cesius: ");
        double C = Ceusius.nextDouble();

        double ConversorF = (C * 1.8) + 32;
        System.out.println("Convertendo em Farenheit: " + ConversorF + " F");

        Ceusius.close();


    }

}
