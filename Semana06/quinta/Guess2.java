package quinta;
import java.util.Random;
import java.util.Scanner;

public class Guess2 {
    public static void main(String[] args) {
        
        Random aleatorio = new Random();
        int sorteado = aleatorio.nextInt(100);

        Scanner in = new Scanner(System.in);
        int escolhido = -1;
        // System.out.println(sorteado);
        int tentativas = 0;
        while (escolhido != sorteado) {
            System.out.println("ESCOLHA UM NUMERO DE 0 a 99");
            escolhido = in.nextInt();
            tentativas++;

            if (escolhido != sorteado) {
                int difMod;
                if (escolhido > sorteado) {
                    difMod = escolhido - sorteado;
                } else {
                    difMod = sorteado - escolhido;
                }
                // System.out.println("ERROU!! DIFERENCA: " + difMod);
                if (difMod < 10) {
                    System.out.println("MUITO QUENTE");
                } else if (difMod < 20) {
                    System.out.println("QUENTE");
                } else if (difMod < 30) {
                    System.out.println("MORNINHO");
                } else {
                    System.out.println("FRIO");
                }
            }
        }
        System.out.println("VC ACERTOU! FIM");
        System.out.println("TENTATIVAS: " + tentativas);


    }
}
