package exercicios03;

import java.util.Scanner;

public class academia2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int codigoMaisAlto = 0; 
        int codigoMaisBaixo = 0; 
        int codigoMaisGordo = 0; 
        int codigoMaisMagro = 0;
        double alturaMaisAlta = 0; 
        double alturaMaisBaixa = Double.MAX_VALUE; 
        double pesoMaisGordo = 0;
        double pesoMaisMagro = Double.MAX_VALUE;
        double somaAlturas = 0; 
        double somaPesos = 0;
        int quantidadeClientes = 0;
        double altura;
        double peso;

        while (true) {
            System.out.print("Digite o código do cliente (0 para sair): ");
            int codigo = scanner.nextInt();
            if (codigo == 0) {
                break;
            }

            System.out.print("Digite a altura do cliente (em metros): ");
            altura = scanner.nextDouble();
            System.out.print("Digite o peso do cliente (em kg): ");
           peso = scanner.nextDouble();

            somaAlturas += altura;
            somaPesos += peso;
            quantidadeClientes++;

            if (altura > alturaMaisAlta) {
                alturaMaisAlta = altura;
                codigoMaisAlto = codigo;
            }
            if (altura < alturaMaisBaixa) {
                alturaMaisBaixa = altura;
                codigoMaisBaixo = codigo;
            }
            if (peso > pesoMaisGordo) {
                pesoMaisGordo = peso;
                codigoMaisGordo = codigo;
            }
            if (peso < pesoMaisMagro) {
                pesoMaisMagro = peso;
                codigoMaisMagro = codigo;
            }
        }

        if (quantidadeClientes > 0) {
            double mediaAlturas = somaAlturas / quantidadeClientes;
            double mediaPesos = somaPesos / quantidadeClientes;

            System.out.println("Cliente mais alto: Código " + codigoMaisAlto + " com " + alturaMaisAlta + " metros");
            System.out.println("Cliente mais baixo: Código " + codigoMaisBaixo + " com " + alturaMaisBaixa + " metros");
            System.out.println("Cliente mais gordo: Código " + codigoMaisGordo + " com " + pesoMaisGordo + " kg");
            System.out.println("Cliente mais magro: Código " + codigoMaisMagro + " com " + pesoMaisMagro + " kg");
            System.out.println("Média das alturas: " + mediaAlturas + " metros");
            System.out.println("Média dos pesos: " + mediaPesos + " kg");
        } else {
            System.out.println("Nenhum cliente foi registrado.");
        }

        scanner.close();
    }
}