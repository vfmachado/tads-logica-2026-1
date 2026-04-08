package segunda;

public class Divisores {
    
    public static void main(String[] args) {
        
        // informe todos os divisores de um numero
        /*
            n = 20
            
            1   D       20 % 1 = 0
            2   D       20 % 2 = 0
            3   X
            4   D       20 % 4 = 0
            5   D       20 % 5 = 0
            6   X
            7   X
            8   X
            9   X
            10  D
            11  X
            ... -> nao sao
            19  X
            20  D

            e informe se o numero é primo => numero que tem apenas 2 divisores (1 e ele mesmo)
        */

        int n = 149;
        int divisor = 1;
        int quant = 0;

        while (divisor <= n) {
            if (n % divisor == 0) {
                System.out.println(divisor);
                quant++;
            }
            
            // isso ta fora do if
            divisor++;
        }

        System.out.println("QUANTIDADE DE DIVISORES " + quant);
        if (quant == 2) {
            System.out.println("NUMERO PRIMO");
        } else {
            System.out.println("NAO É UM NUMERO PRIMO");
        }

    }

}
