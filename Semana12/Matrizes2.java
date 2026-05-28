import java.util.Random;

public class Matrizes2 {
    public static void main(String[] args) {
        
        int [][] m = new int[6][10];

        Random rand = new Random();

        // passa por todas as linhas da matriz
        for (int i = 0; i < m.length; i++) {
            // passsar por todas as colunas
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = rand.nextInt(100); // atribui um valor aleatorio entre 0 e 99
            }     
        }

        for (int i = 0; i < m.length; i++) {
            // passsar por todas as colunas
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + "\t"); // imprime o valor da matriz seguido de um espaço
            }
            System.out.println();  // para cada linha printada, dou uma quebra de linha
        }

    }
}
