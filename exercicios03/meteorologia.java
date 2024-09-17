package exercicios03;

import java.util.Scanner;

public class meteorologia {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double temperatura;
        double soma  = 0;
        double menor = Double.MAX_VALUE;
        double maior  = Double.MIN_VALUE;
        System.out.println("Qtd_Temperaturas: ");
        int qtd_Temperaturas = scan.nextInt();
       
        for (int i=1; i<=qtd_Temperaturas; i++){
            System.out.println( "temperatura "+ i);

            System.out.print(" Entre com as Temperaturas:");
            temperatura = scan.nextDouble();
            soma += temperatura;

            if(temperatura > maior){
                maior = temperatura;
            }
            if(temperatura < menor){
                menor = temperatura;
            }
        }
        System.out.println("Media: " + (soma / qtd_Temperaturas));
        System.out.println("Menor temperatura: " + menor);
        System.out.println("Maior temperatura: " + maior);

        scan.close();
    }
}
