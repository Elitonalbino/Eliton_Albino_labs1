package exercicios03;

import java.util.Scanner;

public class numeros {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        int par = 0;
        int impar = 0;
        for(int i=0; i<10; i++){
            System.out.println("Digite os numeros:");
            num = scan.nextInt();
            
            if(num %2 == 0){
            par ++;
        }else if(num %2 !=0){
            impar ++;     
        } 
    }
            
    System.out.println("soma par: " + par);
    System.out.println("soma impar: " + impar);
      scan.close();  
    }
    }

