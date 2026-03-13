import java.util.Scanner;

public class Maior {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int a, b;
        
        System.out.println("digite 2 numeros");

        a = in.nextInt();       // 3 e 1  => a     1 e 3  => b
        b = in.nextInt();

        if (a > b) {
            // bloco de codigo que quero executar quando a > b
            System.out.println("maior " + a);
        }

        if (b > a) {
            System.out.println("maior " + b);
        }

        // dois iguals representa uma comparacao logica
        if (a == b) {
            System.out.println("os numeros sao iguais");
        }

    }

}