public class Ex06 {
    public static void main(String[] args) {
        
        int x = 2;

        // 5! = 5 x 4!
        // 4! = 4 x 3 x 2 x 1 
        int fatorial = 1;
        float soma = 1;
        float numerador = x;
        for (int i = 1; i <= 10; i++) {
            fatorial = fatorial * i;
            soma = soma + numerador/fatorial;
            System.out.println("numerador " + numerador + "  fatorial "+ fatorial + " soma: " + soma);

            numerador = numerador * x;
        }

        System.out.println("E = " + soma);

    }
}
