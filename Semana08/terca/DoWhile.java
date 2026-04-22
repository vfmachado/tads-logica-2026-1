package terca;
import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String senha = "12345";
        String digita;

        // do .. while primeiro executa o bloco e depois testa
        do {
            digita = in.next();
        } while (!senha.equals(digita));


        do {
            // bloco sera executado pelo menos uma vez.
        } while (false);
        
        int a = 5;
        int b = 2 + ++a;
        System.out.println(b);
    }
}
