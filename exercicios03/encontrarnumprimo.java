package exercicios03;

import java.util.Scanner;

public class encontrarnumprimo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com o numero: ");
        int num = scan.nextInt();

        for(int i=1; i<num; i++){
            boolean primo = true;
            
            for(int j=2; j<i; j++){
                if(i % j == 0){
                    primo = false;

            }
        }
        if(primo){
            System.out.println(i);
        }
        scan.close();
    }

}
}