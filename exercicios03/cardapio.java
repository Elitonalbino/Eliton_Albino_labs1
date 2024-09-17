package exercicios03;

import java.util.Scanner;

public class cardapio {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean naoTerminar = true;
        int cod, qtd;
        double total = 0;
        String output = "";
        do{
            System.out.println("Digite o codigo e a quantidade digite 00 para sair");
            cod = scan.nextInt();
            qtd = scan.nextInt();
           
            if (cod == 0 && qtd == 0){
                naoTerminar = false;
                output += "total: "  + total;
           
            }else{
                if(cod == 100){
                    output += "Cachorro quente: 1,20 * " + qtd;
                    output += " = " + (1.20 * qtd) + "\n"; 
                    total += (1.20 * qtd);


                }else if(cod == 101){
                    output += "Bauru Simples: 1,30 * " + qtd;
                    output += " = " + (1.30 * qtd) + "\n"; 
                    total += (1.30);

                }else if(cod == 102){
                    output += "Bauru Com Ovo: 1,50 * " + qtd;
                    output += " =" + (1.50 * qtd) + "\n"; 
                    total += (1.50 * qtd);

                }else if(cod == 103){
                    output += "Hambúrguer: 1,20 * " + qtd;
                    output += " =" + (1.20 * qtd) + "\n"; 
                    total += (1.20 * qtd);
                
                }else if(cod == 104){
                    output += " Cheeseburguer: 1,30 * " + qtd;
                    output += " =" + (1.30 * qtd) + "\n"; 
                    total += (1.30);

                }else if(cod == 105){
                    output += " Refrigerante: 1,40 * " + qtd;
                    output += " =" + (1.40 * qtd) + "\n"; 
                    total += (1.40 * qtd);

                scan.close();

                }
            }
        }while(naoTerminar);
        System.out.println(output);
    }

}
