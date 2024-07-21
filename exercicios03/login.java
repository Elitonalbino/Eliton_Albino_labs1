package exercicios03;

import java.util.Scanner;


public class login {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean infoValidas = false;
        do{
            System.out.println("Digite o nome: ");
            String nome = scan.next();
            System.out.println("Digite a Senha: ");
            String senha = scan.next();

            if(nome.equalsIgnoreCase(senha)){
                infoValidas = false;
            System.out.println("Senha Invalida e usuario Invalido digite novamente");    
            }else{
                infoValidas = true;
                System.out.println("Senha e usuario validos");
            }
            
          }while(!infoValidas);

          scan.close();
       }
    }

