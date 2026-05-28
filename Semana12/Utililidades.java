import java.util.Random;

public class Utililidades {
    
    public static void mostraMatriz(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void preencheAleatorio(int [][] m, int min, int max) {
        Random r = new Random();
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = r.nextInt(max - min + 1) + min; // gera um numero aleatorio entre min e max
            }
        }
    }
}
