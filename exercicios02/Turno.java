package exercicios02;

import java.util.Scanner;

public class Turno {
    public static void main(String[] args) {
        Scanner turno = new Scanner(System.in);
        System.out.print("Digite o Turno que você Estuda M ou V ou N: ");
        String letra = turno.nextLine();

        if (letra.equalsIgnoreCase("M")){
        System.out.println("M - Matutino: Bom dia");
        }else if(letra.equalsIgnoreCase("V")){
        System.out.println("V- Vespetino: Boa Tarde");
        }else if(letra.equalsIgnoreCase("N")){
        System.out.println("N- Noturno: Boa noite");
        }else{
        System.out.println("Valor Invalido");
        
        turno.close();
    }
  }    
}
