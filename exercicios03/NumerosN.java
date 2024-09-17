package exercicios03;
import java.util.Scanner;

public class NumerosN {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int n;
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int somaTotal = 0;
        
        for(int i=0; i<5; i++){
            
            System.out.println("Numeros N: ");
            n = scan.nextInt();
            
            if(n > maior){
            maior = n;
        } else if(n < menor){
            menor = n;
            
    somaTotal = maior + menor;
     
        }
        
    }
        System.out.println("Valor Maior: "  + maior);
        System.out.println("Valor Menor: "  + menor);
        System.out.println("Soma: " + somaTotal );


        scan.close();

    }

}


