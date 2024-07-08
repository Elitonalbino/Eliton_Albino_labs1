package exercicios02;

import java.util.Scanner;

public class precoCarne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o tipo de Carne: ");
        System.out.println(" 1- File Duplo ");
        System.out.println(" 2- Alcatra ");
        System.out.println(" 3- Picanha ");
        int tipo = scan.nextInt();
        double preco = 0;
 

        System.out.println(" Digite o qtd em (kg): ");
        double qtdCarne = scan.nextDouble();

        if(tipo == 1){
            if(qtdCarne < 5){
                preco = 4.90;
            }else{
                preco = 5.90;
            }
       
        }else if(tipo == 2){
            if(qtdCarne < 5){
                preco = 5.90;
            }else{
                preco = 6.80;
            }
        }else if(tipo == 3){
            if(qtdCarne < 5){
                preco = 6.90;
            }else{
                preco = 7.80;
            }

        }

      double precoTotal = qtdCarne * preco;
      System.out.println("Preço: " + precoTotal);

      System.out.println("Compra no Cartao digite 1 para Sim: ");
      int cartaoTabajara = scan.nextInt();
      
      if(cartaoTabajara == 1){
        double cartaodesconto = (precoTotal / 100) * 5;
        System.out.println("Desconto de: " + cartaodesconto);
        System.out.println("Valor a pagar: " + (precoTotal - cartaodesconto));
      }else{
        System.out.println("Valor a Pagar: " + precoTotal);
      }


        scan.close();
    }
 }


