package quinta;
import java.util.Random;
import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random aleatorio = new Random();
        
        int tentativas = 0;
        int numero = -1;
        int testes = 10000;
        int maior = 0;
        int melhor = -1;
        while (testes > 0) {
            while (numero != 99) {
                numero = aleatorio.nextInt(100); // sortear um numero de 0 a 99
                tentativas++;
                // System.out.println(numero + "  -  tentativa: " + tentativas);
            }
            System.out.println(tentativas);

            if (tentativas > maior) {
                maior = tentativas;
            }

            if (melhor == -1 || tentativas < melhor) {
                melhor = tentativas;
            }

            testes--;
            tentativas = 0;
            numero = -1;
        }

        System.out.println("A PIOR SIMULACAO DENTRE AS 10k LEVOU " + maior + " TENTATIVAS PARA SORTEAR O NUMERO CERTO");
        System.out.println("A MELHOR SIMULACAO DENTRE AS 10k LEVOU " + melhor + " TENTATIVAS PARA SORTEAR O NUMERO CERTO");
    }
}
