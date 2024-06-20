package exercicios01;
import java.util.Scanner;

public class PesoIdeal {
    public static void main(String[] args) {
        Scanner peso = new Scanner(System.in);
        System.out.println("Digite sua Altura1: ");
        double Altura1 = peso.nextDouble();

        System.out.print("Digite o sexo: ");
        String sexo1 = peso.next();
        System.out.println("seu sexo e: " + sexo1);

        double Homens = 72.7 * Altura1 - 58;
        System.out.println("Peso homem: " + Homens);
        if (Homens >= 100){
            System.out.println("Acima do Peso");
        }else{
         System.out.println("Peso ideal");
        }
        
        System.out.print("Digite sua Altura2: ");
        double Altura2 = peso.nextDouble();
        System.out.println("Sua Altura e: " + Altura2);

        System.out.print("Digite o sexo: ");
        String sexo2 = peso.next();
        System.out.println("seu sexo e: " + sexo2);
         
       double Mulher = 62.1 * Altura2 - 44.7;
       System.out.println("Peso  Mulher: " + Mulher);

       if (Mulher >= 100){
        System.out.println("Acima do Peso");
        
    }else{
     System.out.println("Peso ideal");
    }
       

        peso.close();
    }

}
