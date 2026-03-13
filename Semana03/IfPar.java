import java.util.Scanner;

public class IfPar {
    public static void main(String[] args) {

        // FAÇA UM PROGRAMA QUE DADO UM NUMERO INTEIRO IDENTIFIQUE SE
        // É PAR E MENOR QUE 20
        // É PAR E MAIOR OU IGUAL A 20
        // É IMPAR E MENOR DE 15
        // É IMPAR E MAIOR OU IGUAL A 15

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        if (n % 2 == 0) {
            // par
            System.out.println("PAR");
            if (n >= 20) {
                System.out.println("Maior ou igual a 20");
            } else {
                System.out.println("Menor que 20");
            }
        } else {
            // impar
            System.out.println("IMPAR");
            if (n < 15) {
                System.out.println("Menor que 15");
            } else {
                System.out.println("maior ou igual a 15");
            }
        }
    }
}