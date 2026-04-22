package quinta;

public class Ex01 {
    public static void main(String[] args) {
        
        int x = 5;
        int n = 10;
        int numerador = 1;
        int denominador = 1;     // 4! = 4 x 3 x 2 x 1     5! = 5 x 4!    6! = 6 x 5!
        float soma = 1;

        // quantas vezes o bloco será repetido?
        for (int i = 1; i < n; i++) {
            numerador = numerador * x;
            denominador = denominador * i;
            soma = soma + (float) numerador / denominador;
            System.out.println("numerador = " + numerador + "  /  denominador = " + denominador + "   somando " + soma );
            
        }

        System.out.println("RESPOSTA FINAL "  +  soma);
    }
}
