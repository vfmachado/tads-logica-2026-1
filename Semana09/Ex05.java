public class Ex05 {
    public static void main(String[] args) {
        
        int n = 10;

        // 5! = 5 x 4!
        // 4! = 4 x 3 x 2 x 1 
        int fatorial = 1;
        float soma = 1;
        for (int i = 1; i <= n; i++) {
            fatorial = fatorial * i;
            
            soma = soma + 1f/fatorial;
            // System.out.println(fatorial + " soma: " + soma);

        }

        System.out.println("E = " + soma);

    }
}
