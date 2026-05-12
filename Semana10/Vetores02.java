import java.util.Random;
import java.util.Scanner;

public class Vetores02 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        int [] v = new int[6];
        Random random = new Random();

        for (int i = 0; i < v.length; i++) {
            v[i] = random.nextInt(60) + 1;
            // System.out.println(v[i]);
        }
    
        System.out.println("TAMANHO: " + v.length);

        // buscar um valor no vetor e retornar sua posicao, caso nao exista, retornar -1

        while (true) {

            int valor = in.nextInt();

            int posicao = -1;
            for (int i = 0; i < v.length; i++) {
                if (v[i] == valor) {
                    posicao = i;
                }
            }
            System.out.println("POSICAO: " + posicao);

        }

    }
}
