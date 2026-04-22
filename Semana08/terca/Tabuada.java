package terca;
public class Tabuada {
    
    public static void main(String[] args) {
        
        // tabuada
        int soma = 0;
        for (int i = 1; i <= 10; i++) {
            soma = 0;
            System.out.println("TABUADA DO " + i);
            for (int j = 1; j <= 10; j++) {
                int mult = i * j;
                soma = soma + mult;
                System.out.println(i + " x " + j + " = " + mult);  
            }
            System.out.println("soma da tabuada: " + soma);
        }

    }

}
