import java.util.Scanner;

public class Vetores01 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        int [] v = { 2, 3, 10, 15, 20, 21, 30, 34, 40, 48, 50, 67, 75, 99 };
    
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
