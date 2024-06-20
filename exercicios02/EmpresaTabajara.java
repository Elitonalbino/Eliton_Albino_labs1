package exercicios02;

import java.util.Scanner;

public class EmpresaTabajara {
    public static void main(String[] args) {
        Scanner Salario = new Scanner(System.in);
        System.out.println("Digite o nome do Colaborador: ");
        String Nome = Salario.nextLine();
        System.out.println("Digite o Salario Atual: ");
        double SalarioAtual = Salario.nextDouble();
        System.out.println("Digite o  Percentual do Reajuste: ");
        double Percentual = Salario.nextDouble();
        double SalarioReajunte = (SalarioAtual / 100) * Percentual;
        double NovoSalario = SalarioAtual + SalarioReajunte;

        if(SalarioAtual  <= 280 && Percentual == 20){
        System.out.println("Nome: "  + Nome +"\n" 
        + "Seu Salario e: " + SalarioAtual+"\n" 
        + "Percentual de Aumento e: " + Percentual + " % " +"\n"
        + "Reajuste: "  + SalarioReajunte + "\n" 
        + "Novo Salario: " + NovoSalario +"\n");
        
        }else if(SalarioAtual <= 700 && Percentual == 15){
        System.out.println("Nome: " + Nome  +"\n" 
        + "Seu Salario e: " + SalarioAtual +"\n"
        +  "Percetual de Aumento e: " + Percentual + " % " + "\n" 
        +  "Reajuste: "  + SalarioReajunte +"\n" 
        + "Novo Salario: " + NovoSalario +"\n");

        }else if(SalarioAtual <= 1500 && Percentual <=10){
        System.out.println("Nome: " + Nome +"\n" 
        + "Seu Salario e: " + SalarioAtual  +"\n"
        + "Percentual de Aumento e: " + Percentual + " % " +"\n" 
        + "Reajuste: "  + SalarioReajunte +"\n"
        + "Novo Salario: " + NovoSalario +"\n");
        

        }else if(SalarioAtual >= 1500 && Percentual <=5){
        System.out.println("Nome: " + Nome +"\n" 
        + "Seu Salario e: " + SalarioAtual  +"\n"
        + "Percentual de Aumento e: " + Percentual + " % " + "\n" 
        + "Reajuste: " + SalarioReajunte  +"\n"
        + "Novo Salario: " + NovoSalario +"\n");
        }else{
        System.out.println("Percentual Invalido"); 
        

        Salario.close();
    
        
    }
  }
}
