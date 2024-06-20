package exercicios01;
import java.util.Scanner;

public class CalculoPeso {
    public static void main(String[] args) {
        Scanner ideal = new Scanner(System.in);
        System.out.println("Digite sua Altura: ");
        double Altura = ideal.nextDouble();

        double ConversorP = 72.7 *Altura - 58;
        System.out.println("Conversor de Pesso ideal: " + ConversorP + " Peso Ideal");

        ideal.close();

    }

}
