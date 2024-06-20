package exercicios02;

import java.util.Scanner;

public class FolhaPagamento {
    public static void main(String[] args) {
        Scanner folha = new Scanner(System.in);
        System.out.print("Digite o Salario Bruto: ");
        double salarioBruto = folha.nextDouble();

        double FGTS = 0;
        double IR = 0;
        double INSS = 0;
        INSS = salarioBruto * 10 / 100;
        FGTS = salarioBruto * 11 / 100;
       

       double qtdHoras = 220;
       double GanhoHora = (salarioBruto / qtdHoras);
       
       if(salarioBruto <= 900){
       System.out.println("Isento do IR ");
      
       }else if(salarioBruto > 900 && salarioBruto <+1500){
       IR = salarioBruto * 5 / 100;
       }else if(salarioBruto >= 1500 && salarioBruto <= 2500){
       IR = salarioBruto * 10 / 100;
       }else if(salarioBruto >= 2500){
       IR = salarioBruto * 20 / 100;
      
      double totalDescontos = IR + INSS; 
      double salarioLiquido = salarioBruto - IR -INSS; 
      
      
       System.out.println("Salario Bruto: " + salarioBruto);
       System.out.println("Ganho por hora: " + GanhoHora);
       System.out.println("Deposito FGTS: " + FGTS);
       System.out.println("Total de Descontos: " + totalDescontos);
       System.out.println("Salario Liquido: " + salarioLiquido);
      

        folha.close();
    }
  }
}
