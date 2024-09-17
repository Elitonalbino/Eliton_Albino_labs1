package exercicios03;

import java.util.Scanner;


public class idade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Qtd de Pessoas:");
        int qtdPessoas = scan.nextInt();
        int idade;
        double media = 0;
        int soma = 0;
        for(int i=0; i<qtdPessoas; i++){
            System.out.println( "Idade: " + i);
            idade = scan.nextInt();
            
            soma+= idade;
        }
        media = soma / qtdPessoas;
        if(media>=0 && media<=25 ){ 
            System.out.println(media+ " Jovem");
        } if(media>=26 && media<60){ 
            System.out.println(media + " adulto");
        }else if(media>60){
            System.out.println(media + " Idoso");

          
        }
        scan.close();
    }

}
