package exercicios01;
import java.util.Scanner;

public class RedimentoPescador {

    public static void main(String[] args) {
        Scanner pescar = new Scanner(System.in);
        
        System.out.println("Digite quanto Quilos vc Pegou:");
        double PesoPeixe = pescar.nextDouble();

        double excesso = 0;
        double multa = 0;

        if (PesoPeixe <= 50){
        System.out.println("Isento da Multa " );
          
        }else{
       excesso = PesoPeixe - 50;
       multa = excesso * 4;

       System.out.println("Excesso de Peixe: " + excesso + " KG");
       System.out.println("multa: " + multa);
         

        pescar.close();


    }
  }
}
