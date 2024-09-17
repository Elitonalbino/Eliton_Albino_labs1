package exercicios03;

import java.util.Scanner;

public class turmas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Quantidades de turma: ");
        int qtdTurma = scan.nextInt();
        double Alunos = 0;
        double media = 0;
        double totalAlunos = 0;
        for(int i=1; i<=qtdTurma; i++){
            System.out.println("Turma: " + i);
            
          do{
            System.out.println("quatidade de Alunos: ");
            Alunos = scan.nextInt();
            if(Alunos > 40){
                System.out.println("Turma Excedeu o limite");
                }
        }while (Alunos > 40);
            totalAlunos += Alunos;
    }
        
        media = totalAlunos / qtdTurma;
        System.out.println("Media: " + media);
        scan.close();
        }
    
    }


