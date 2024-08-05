package exercicios03;

import java.util.Scanner;

public class fatorial2 {
    public static void main(String[] args) {
        
    
     Scanner scan = new Scanner(System.in);
        int f = 0;
        for(int i=0; i<5; i++){
            System.out.println("digite o fatorial: ");
            f = scan.nextInt();
        
            if(f>0 && f<=16){
               System.out.println(f + "! = " );
            }else{
                System.out.println("Fatorial Invalido");
                break;
                
            }
            int j;
            int fato = 1;
            
            for( j=f; j>0; j--){
                fato *= j;
               System.out.println(j);
                }
                System.out.println("resultado: " + fato);   
        }
        scan.close();
    }
}
   

package exercicios03;

import java.util.Scanner;

public class fatorial2 {
    public static void main(String[] args) {
        
    
     Scanner scan = new Scanner(System.in);
        int f = 0;
        for(int i=0; i<5; i++){
            System.out.println("digite o fatorial: ");
            f = scan.nextInt();
        
            if(f>0 && f<=16){
               System.out.println(f + "! = " );
            }else{
                System.out.println("Fatorial Invalido");
                break;
                
            }
            int j;
            int fato = 1;
            
            for( j=f; j>0; j--){
                fato *= j;
               System.out.println(j);
                }
                System.out.println("resultado: " + fato);   
        }
        scan.close();
    }
}
   

>>>>>>> Stashed changes
