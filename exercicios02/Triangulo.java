package exercicios02;

import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner triangulo = new Scanner(System.in);
        System.out.println("Digite o l1 do Triangulo: ");
        double l1 = triangulo.nextDouble();
        System.out.println("Digite o l2 do Triangulo: ");
        var l2 = triangulo.nextDouble();
        System.out.println(" Digite o l3 do Triagulo: ");
        double l3 = triangulo. nextDouble();

        if(((l1 + l2) > l3) || (((l1 + l3) > l2) 
        || (((l2 + l3) > l1) ))){
       
        if (l1 == l2 && l2 == l3){
        System.out.println("Triângulo e Equilatero");
        }else if(l1 != l2 && l2 != l3 && l3 != l2){
        System.out.println("O Triângulo e Escaleno");
        }else if(l1 == l2 || l1 == l3 || l2 == l3){ 
        System.out.println("Triângulo Isósceles");
    
        }else{
        System.out.println("Nao forma um triângulo");
        

        triangulo.close();
    }
  }
 }
}
