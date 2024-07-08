package exercicios02;

import java.util.Scanner;

public class Posto {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite quantos Litros: ");
        double litro = scan.nextDouble();
        System.out.println("Qual combustivel para Abastecer A-Alcool G- Gasolina: ");
        String Combustivel = scan.next();
        double A = 1.90;
        double G = 2.50;
        double desc = 0;
        double totalPagarA = A * litro;
        double totalPagarG = G * litro;
        if(Combustivel.equalsIgnoreCase("A" )){
             if (litro <= 20){
                desc = (totalPagarA  * 3) / 100;   
                System.out.println("Total a pagar R$: " + "Alcool: " + (totalPagarA - desc));
            } else if(litro > 20){
                desc = (totalPagarA  * 5) / 100;  
                System.out.println("Total a pagar R$: " + "Alcool: "  + (totalPagarA - desc));
            }
            }else if(Combustivel.equalsIgnoreCase("G")){      
              
             if (litro <= 20){
                desc = (totalPagarG * 4) / 100;  
                System.out.println("Total a pagar R$: "+ "Gasolina: " + (totalPagarG - desc));
            } else if(litro > 20){
                desc = (totalPagarG * 6) / 100;   
                System.out.println("Total a pagar R$: " + "Gasolina: "  + (totalPagarG - desc));
            }   
    
            
        scan.close();
    }
  }
}

