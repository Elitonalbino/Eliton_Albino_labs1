package exercicios03;

import java.util.Scanner;

public class cadastro {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        boolean Validas = false;
        String nome;
        int idade;
        double salario;
        String sexo;
        String estadoCivil;
        do{
            System.out.println("Digite o Nome: ");
            nome = scan.next();
            if(nome.length() >= 3){
                Validas = true; 
               }else{
                System.out.println("Nome Invalido, digite novamente ");
            }
    }while(!Validas);
    Validas = false;
        do{
            System.out.println("Digite a Idade:");
            idade = scan.nextInt();
            
            if(idade >=0 && idade <= 150){
                Validas = true; 
            }else{
                System.out.println("idade Invalida, Precisa ser 0 a 150 ");
            }
    }while(!Validas);
    Validas = false;
        do{
            System.out.println("Digite a Salario:");
           salario = scan.nextDouble();
            
            if(salario> 0){
                Validas = true; 
            }else{
                System.out.println("Salario Invalido, Precisa ser Maior que 0 ");
            }
    }while(!Validas);
    Validas = false;
    do{
        System.out.println("Digite a Sexo:");
       sexo = scan.next();
        
        if(sexo.equalsIgnoreCase("F")|| 
           sexo.equalsIgnoreCase("M")) {
            Validas = true; 
        }else{
            System.out.println("Sexo Invalido, Precisa ser M ou F ");
        }
    }while(!Validas);

    Validas = false;
        do{
            System.out.println("Digite a Estado Civil :");
        estadoCivil = scan.next();
            
            if(estadoCivil.equalsIgnoreCase("s")|| 
            estadoCivil.equalsIgnoreCase("c")|| 
            estadoCivil.equalsIgnoreCase("v")|| 
            estadoCivil.equalsIgnoreCase("d")) {
                Validas = true; 
            }else{
                System.out.println("Estado civil Invalido, Precisa ser s ou c ou v ou d ");
            }
    }while(!Validas);
    System.out.println("Nome: " + nome );
    System.out.println("Idade: " + idade);
    System.out.println("Salario: " + salario);
    System.out.println("sexo: " + sexo );
    System.out.println("Estado Civil: " + estadoCivil);


            scan.close();
        }
        }


