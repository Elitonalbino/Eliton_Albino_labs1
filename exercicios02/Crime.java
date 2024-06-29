package exercicios02;

import java.util.Scanner;

public class Crime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Perguta 1: Telefonou para a vitima? ");
        String resp1 = scan.next();
        System.out.println("Perguta 2: Esteve no local do crime? ");
        String resp2 = scan.next();
        System.out.println("Perguta 3: Mora perto da vítima? ");
        String resp3 = scan.next();
        System.out.println("Perguta 4: devia para a vítima? ");
        String resp4 = scan.next();
        System.out.println("Perguta 5: Já trabalhou com a vítima? ");
        String resp5 = scan.next();

        int cont = 0;


        if(resp1.equalsIgnoreCase("Sim")){
            cont ++;
        }
        if(resp2.equalsIgnoreCase("Sim")){
            cont ++;
        }
        if(resp3.equalsIgnoreCase("Sim")){
            cont ++;
        }
        if(resp4.equalsIgnoreCase("Sim")){
            cont ++;
        }
        if(resp5.equalsIgnoreCase("Sim")){
            cont ++;
        }
        if(cont == 2){
            System.out.println("Suspeito");
        }else if(cont == 3  || cont == 4){
            System.out.println("Cuplice");
        }else if(cont == 5){
            System.out.println("Assassino");
        }else if(cont == 0){
            System.out.println("Inocente");


        scan.close();
    }
 }
}
