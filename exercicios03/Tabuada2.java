package exercicios03;

import java.util.Scanner;

public class Tabuada2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean invalido = false;
        int n1;
        int n2;
        int resultado = 0;
        do{
            System.out.println("Digite o Numero: de Inicio da Tabuada");
             n1 = scan.nextInt();
            System.out.println("Digite o numero final da Tabuada: ");
             n2 = scan.nextInt();
            if(n2 > n1){
                invalido = true;
            }

        }while(!invalido);
       
       
            for(int i= n1; i<=n2;  i++){
                System.out.println("Tabuada:" + n1);
                 resultado = n1 * i;
                 System.out.println( n1 + " x " + i + " = " + resultado);
        }
        scan.close();
    }

}
