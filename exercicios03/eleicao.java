package exercicios03;

import java.util.Scanner;

public class eleicao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int c1 = 12;
        int c2 = 13;
        int c3 = 23;
        int voto = 0;
        int soma = 0;
        int totalVotos;
        System.out.println("qtd eletores: ");
        int eleitores = scan.nextInt();

        for(int i=1; i<=eleitores; i++){
            System.out.println("Escolha para votar: ");
            System.out.println(" 12:Bodinho " );
            System.out.println(" 13:Aritana ");
            System.out.println(" 23:Bonifacio ");
           
            System.out.println("Eleitor " + i);
            System.out.print("Voto: ");
            voto = scan.nextInt();
            if(voto == 12){
                System.out.println("Bodinho");
            }else  if(voto == 13){
                System.out.println("Aritana");
            }else if(voto == 23){
            System.out.println("Bonifacio");
           }
        }
        totalVotos = eleitores += soma;
        System.out.println("total votos: " + totalVotos);
        if(c1 == voto && c1 < c2 && c1 < c3){
            System.out.println("Bodinho Campeao");
        }else if(voto == c2 && c2 > c1 && c2< c3  ){
            System.out.println("Aritana Campeao");
        }else if(voto == c3 && c3 > c2 && c3 > c1){
            System.out.println("Bonifacio Campeao");
        }
       
        scan.close();
    }

}
