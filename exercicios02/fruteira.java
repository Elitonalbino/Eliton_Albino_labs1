package exercicios02;

import java.util.Scanner;

public class fruteira {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com Quantidade do morango em kg: ");
        double morango = scan.nextDouble();
        System.out.println("Entre com Quantidade do maça em kg: ");
        double maça = scan.nextDouble();
        double precoMorango = 0;
        double PrecoMaca = 0;
        double TotalMorango; 
        double TotalMaca;

        if(morango <= 5){
            precoMorango = 2.50;
        }else{
            precoMorango =2.20;
        }
        if(maça <= 5){
            PrecoMaca = 1.80;
        }else{
            PrecoMaca = 1.50;
        }
         
       TotalMorango = precoMorango * morango;
       TotalMaca = maça * PrecoMaca;
       System.out.println("Preço Morango R$: "  + TotalMorango);
       System.out.println("Preço Maça  R$: " + TotalMaca);
       double precoParcial = precoMorango + PrecoMaca;
       double precoTotal = precoParcial;
       if(precoParcial > 8 || precoParcial > 25){
         precoTotal = precoParcial -((precoParcial / 100) * 10);
       
       }
       System.out.println("Preço Total com desconto R$: " + (precoTotal));



     
       
        
       scan.close();
    }

}
