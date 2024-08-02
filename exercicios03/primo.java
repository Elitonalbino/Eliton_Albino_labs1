package exercicios03;

import java.util.Scanner;

public class primo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        System.out.println("Digite um numero: ");
        num = scan.nextInt();
        boolean primo  = true;
        
        for(int i=2; i<num; i++){
            if(num % i == 0){
                System.out.println("Nao e  primo");
                primo = false;
            }
        }
        if(primo){
            System.out.println("E numero primo");
          }
          scan.close();
        }
    }
    


        
    


    


