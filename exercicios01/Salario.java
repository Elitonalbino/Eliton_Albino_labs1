package exercicios01;
import java.util.Scanner;

public class Salario { 
    public static void main(String[] args) {
        Scanner salario = new Scanner(System.in);
        System.out.print(" digite o Salario Bruto: ");
        double SalarioBruto = salario.nextDouble();
        
        System.out.print("Digite as Horas Trabalhadas: ");
        double HorasTrabalhadas = salario.nextDouble();
        
        double GanhoHora = SalarioBruto / HorasTrabalhadas;
        System.out.println("Ganho por Hora: " + GanhoHora);

        double TotalSalario = GanhoHora * HorasTrabalhadas;
        System.out.println("Total do Salario: " + TotalSalario + " No Mês");
        salario.close();


    }

}
