package exercicios03;

import java.util.Scanner;

public class populacao1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double popA;
        double popB;
        double taxaA;
        double taxaB;
       
        boolean valido = false;
        do{
            System.out.println("Digite a População A: ");
            popA = scan.nextDouble();
            if( popA > 0){
                valido = true;
            }else{
                System.out.println("Populaçao A Precisa ser maior que 0");
            }
        
        }while(!valido);


        valido = false;

        do{
            System.out.println("Digite a Populaçao B: ");
            popB = scan.nextDouble();
            if( popB > 0){
                valido = true;
            }else{
                System.out.println("Populaçao B Precisa ser maior que 0");
            }
            
        }while(!valido);


        valido = false;

        do{
            System.out.println("entre com a taxa de crescimento da população A: ");
            taxaA= scan.nextDouble();
            if( taxaA > 0){
                valido = true;
            }else{
                System.out.println("A taxa de crescimento da população A Precisa ser maior que 0");
            }
            
        }while(!valido);

        valido = false;

        do{
            System.out.println("entre com a taxa de crescimento da população B: ");
            taxaB= scan.nextDouble();
            if( taxaB > 0){
                valido = true;
            }else{
                System.out.println("A taxa de crescimento da população B Precisa ser maior que 0");
            }
            
        }while(!valido);

        int cont = 0;
        while (popA < popB) {
            popA +=( popA / 100) * taxaA;
            popB +=(popB / 100) * taxaB;
            cont++;
            System.out.println("PopA: " + popA);
            System.out.println("PopB: " + popB);
            System.out.println("Qtd anos: " + cont);

            scan.close();


    }
  }  

}
