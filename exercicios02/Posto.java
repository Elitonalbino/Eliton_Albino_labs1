package exercicios02;

import java.util.Scanner;

public class Posto {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual combustivel para Abastecer A-Alcool G- Gasolina: ");
        String Combustivel = scan.next();
        if(Combustivel.equalsIgnoreCase("G")){
            System.out.println("Gasolina");
        }else if(Combustivel.equalsIgnoreCase("A")){
            System.out.println("Alcool");
        }
        System.out.println("Digite quantos Litros: ");
        double litro = scan.nextDouble();
        double desc = 0;
        double A = 1.90;
        double G = 2.50;
        double totalPagarA = A * litro;
        double totalPagarG = G * litro;
        if(litro <= 19){
            System.out.println("Total a Pagar R$: " + totalPagarA);
        } else if (litro == 20){
            desc = (totalPagarA  * 3) / 100;   
            System.out.println("Total a pagar R$: "  + (totalPagarA - desc));
        } else if(litro > 20){
            desc = (totalPagarA  * 5) / 100;  
            System.out.println("Total a pagar R$: "  + (totalPagarA - desc));
        }
        if(litro <= 19){
            System.out.println("Total a Pagar R$: " + totalPagarG);
        } else if (litro == 20){
            desc = (totalPagarG * 4) / 100;  
            System.out.println("Total a pagar R$: "  + (totalPagarG - desc));
        } else if(litro > 20){
            desc = (totalPagarG * 6) / 100;   
            System.out.println("Total a pagar R$: "  + (totalPagarG - desc));
        }   

        scan.close();
    }

}
