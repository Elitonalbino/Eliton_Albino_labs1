package exercicios03;

    import java.util.Scanner;

public class mediaturma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe a quantidade de turmas: ");
        int numTurmas = scan.nextInt();
        int totalAlunos = 0;

        for (int i = 1; i <= numTurmas; i++) {
            int alunos;
            do {
                System.out.print("Informe a quantidade de alunos na turma " + i + " (máximo 40): ");
                alunos = scan.nextInt();
                if (alunos > 40) {
                    System.out.println("A turma não pode ter mais de 40 alunos. Tente novamente.");
                }
            } while (alunos > 40);
            totalAlunos += alunos;
        }

        double mediaAlunos = (double) totalAlunos / numTurmas;
        System.out.println("O número médio de alunos por turma é: " + mediaAlunos);
        scan.close();
    }
}



