import java.util.Scanner;

public class MaiorElse {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int a, b;
        
        System.out.println("digite 2 numeros");

        a = in.nextInt();       // 3 e 1  => a     1 e 3  => b
        b = in.nextInt();

        if (a > b) {
            // bloco de codigo que quero executar quando a > b
            System.out.println("maior " + a);
        } else if (b > a) {
            System.out.println("maior " + b);
        } else {
            System.out.println("os numeros sao iguais");
        }

        // FAÇA UM PROGRAMA QUE DADO UM NUMERO INTEIRO IDENTIFIQUE SE
        // É PAR E MENOR QUE 20
        // É PAR E MAIOR OU IGUAL A 20
        // É IMPAR E MENOR DE 15
        // É IMPAR E MAIOR OU IGUAL A 15

    }

}