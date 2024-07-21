package exercicios03;

import java.util.Scanner;

public class numeromaior { 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        int maior = Integer.MIN_VALUE;

        for(int i=0; i<5; i++){
        
        System.out.println("Entre com o numero:");
        num = scan.nextInt();       

        if(num > maior){
            maior = num;    
          }  
        }
        System.out.println("Numero Maior: " + maior);
       

        scan.close();
    }

}
