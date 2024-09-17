package exercicios03;

import java.util.Scanner;

public class nota {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        boolean notaValida = false;

        do{
        System.out.println("Digite a nota: ");
        double nota = scan.nextDouble();
        if(nota >=0 && nota <=10){
            notaValida = true;
            System.out.println("nota: " + nota);
        }else{
            System.out.println("nota invalida digite novamente");
        }
        }while (!notaValida);
            

            scan.close();
            
        }
    }


