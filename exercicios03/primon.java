package exercicios03;

import java.util.Scanner;

public class primon {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        System.out.println("Digite um numero: ");
        num = scan.nextInt();
        boolean primo  = true;
        scan.close();
        
        for(int i=2; i<num; i++){   
            if(num % i == 0){    
                int divisores = (i);
                if( i != num / i){
                    divisores = (num / i);
                System.out.println("Nao e  primo: " +"e divisivel por: " + divisores);
                primo = false;
               
                }
            }
        }
        if(primo){
            System.out.println("E numero primo: " + num);
    }
          
   }
}


