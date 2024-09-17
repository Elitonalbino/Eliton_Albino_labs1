package exercicios03;

import java.util.Scanner;

public class lojatabajara {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lojas Tabajara");
        String continuarCompra;
        int qtdProdutos;
        double preco;
        double total;
        boolean sair = false;
        String output;
        double valorPago, troco;
        do{
             System.out.println("Deseja informar uma nova Compra: S/N");
            continuarCompra = scan.next();

            total = 0;
           
            if (continuarCompra.equalsIgnoreCase("s")){
                output = "LojasTabajara\n";
                System.out.println("Digite a quantidade de produtos da compra: ");
                qtdProdutos = scan.nextInt();
                
                for(int i=1; i<=qtdProdutos; i++){
                    System.out.println("Informe o preco do produto: " + i);
                    preco = scan.nextDouble();
                    total += preco;
                    output += "Produto " + i + ": R$ " + preco + "\n";
                }
                output = "Total: R$ " + total + "\n";
                System.out.println("Total: R$ " + total + "\n");
                
                System.out.println("Entre com o valor pago: ");
                valorPago = scan.nextDouble();
                output += "Dinheiro: R$ "  + valorPago + "\n";
                troco = total - valorPago;
                output += "troco: R$ " + troco + "\n";

                System.out.println(output);

               
            }else{
                sair = true;
            }
           

            }while(!sair);
            scan.close();
        }
        
    }


