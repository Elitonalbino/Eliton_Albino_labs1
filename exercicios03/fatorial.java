package exercicios03;

import java.util.Scanner;

public class fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int f = 0;
        System.out.println("digite o fatorial: ");
        f = scan.nextInt();
        
        int fato = 1;
          for(int i=f; i>1; i--){
            fato *= i;
            System.out.print(i + ".");
            }
        System.out.println("1 = " + fato);
    
        scan.close();
        }
    }


