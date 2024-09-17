package exercicios03;

import java.util.Scanner;

public class primo1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int N = scan.nextInt();
        int num = 1;
        boolean primo = true;
        int  totaldivisoes = 0;
        scan.close();

        
        for(int i=num; i<N; i++){
            if(N % i == 0){
                int divisores = (i);
                if(i != num / i){
                    divisores = (N / i);
                    System.out.println("Nao e Primo: " + "Divisivel: " +  divisores );
                    primo = false;
                    totaldivisoes = divisores; 
                    System.out.println("total da divisoes: " + totaldivisoes + i );

                } 
            }
        }
        if(primo){
            System.out.println("Numero e Primo: " + N );
        }
    }

}
