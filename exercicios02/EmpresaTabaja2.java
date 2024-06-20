package exercicios02;

import java.util.Scanner;

public class EmpresaTabaja2 {
    public static void main(String[] args) {
         Scanner Salario = new Scanner(System.in);
        System.out.println("Digite o nome do Colaborador: ");
        String Nome = Salario.nextLine();
        System.out.println("Digite o Salario Atual: ");
        double SalarioAtual = Salario.nextDouble();
        System.out.println("Digite o  Percentual do Reajuste: ");
        double Percentual = 0;


        if(SalarioAtual <= 280){
        Percentual = 20;
        }else if(SalarioAtual > 280 && SalarioAtual < 700){
        Percentual = 15;
        }else if(SalarioAtual >=700 && SalarioAtual <= 1500){
        Percentual = 10;
        }else if(SalarioAtual >= 1500){
        Percentual = 5;

        double SalarioReajunte = (SalarioAtual /100 ) * Percentual;
        double NovoSalario = SalarioAtual + SalarioReajunte;



        System.out.println("Nome: " + Nome);
        System.out.println("Salario Atual: " + SalarioAtual);
        System.out.println("Percentual " + Percentual);
        System.out.println("Salario Reajunte "  + SalarioReajunte);
        System.out.println("Novo Salario: " + NovoSalario);

        Salario.close();
    }
 }
}
