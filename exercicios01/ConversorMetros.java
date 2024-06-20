package exercicios01;
import java.util.Scanner;

public class ConversorMetros {
    public static void main(String[] args) {
        
        Scanner metros = new Scanner(System.in);
        System.out.print("Digite os metros: ");
        double ConvMertros = metros.nextDouble();
        double ConvCent = ConvMertros * 100;
        System.out.println("Convertendo mentros em cm: " + ConvCent + " cm");

        metros.close();
    }
    
}
