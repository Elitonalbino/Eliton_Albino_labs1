package exercicios03;

public class fibonacci500 {
    public static void main(String[] args) {

        int primeiro = 1;
        int segundo = 1;
        int proximo = 0;

        System.out.println("fibonatti: "  + primeiro);
        System.out.println("fibonatti: "  + segundo);
            

        while(proximo <= 500){
            proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;
            System.out.println("fibonatti: "  + proximo);
            
        }

    }
    }


