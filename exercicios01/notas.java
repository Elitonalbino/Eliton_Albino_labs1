package exercicios01;
import java.util.Scanner;

public class notas {
    public static void main(String[] args) {
        Scanner bimestre = new Scanner(System.in);
        System.out.print("Digite o nome do Aluno1: ");
        String NomeAluno1 = bimestre.nextLine();
        System.out.println("Nome do Aluno e: " + NomeAluno1);
        String NomeAluno2 = bimestre.nextLine();
   

        System.out.println("Digite b1 + b2 + b3  + b4 / 4");
        double b1 = bimestre.nextDouble();
        double b2 = bimestre.nextDouble();
        double b3 = bimestre.nextDouble();
        double b4 = bimestre.nextDouble();

        double MediaFinal = (b1 + b2 + b3 + b4) / 4;
        System.out.println("Aluno:" + NomeAluno1 + ", " + "Media Final: " + MediaFinal);
 
        System.out.println("Digite b1 + b2 + b3  + b4 / 4");
        double c1 = bimestre.nextDouble();
        double c2 = bimestre.nextDouble();
        double c3 = bimestre.nextDouble();
        double c4 = bimestre.nextDouble();
 
        double MediaFinal2 = (c1 + c2 + c3 + c4) / 4;
        System.out.println("Aluno:" + NomeAluno2 + ", " + "Media Final: " + MediaFinal2 );
 

        bimestre.close();
    }
}
