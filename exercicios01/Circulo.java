package exercicios01;
import java.util.Scanner;

public class Circulo {
    public static void main(String[] args) {
        Scanner ciculo = new Scanner(System.in);
        System.out.println("Digite o dia diamentro do ciculo: ");
        double diamentro = ciculo.nextDouble();
        double raio = diamentro / 2;
        System.out.println(" raio do circulo e: " + raio);


        double Area =  raio * raio * Math.PI;
        System.out.println("area: "  + Area); 


        ciculo.close();
    }

}
