package exercicios01;
import java.util.Scanner;

public class TemperaturaFarenheit {
    public static void main(String[] args) {
        
        Scanner farenheit = new Scanner(System.in);
        System.out.print("digite a temperatura em farenheit: ");
        double Fare = farenheit.nextDouble();

        double Ceusius = ( Fare - 32)/1.8;
        System.out.println("Convertendo para Graus Ceus: " + Ceusius + " C ");


        farenheit.close();
    }

}
