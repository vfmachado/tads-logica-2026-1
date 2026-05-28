import java.util.Random;
import java.util.Scanner;

public class Busca {
    public static void main(String[] args) {
        
        int [][] m = new int[10][10];
        Random r = new Random();
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = r.nextInt(100);
            }
        }

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }

        while (true) {
            int valor = in.nextInt();
            if (valor == -1) break;
            // em quais posicoes o valor aparece
            boolean encontrado = false;
            for (int i = 0; i < m.length; i++) {
                for (int j = 0; j < m[i].length; j++) {
                    if (m[i][j] == valor) {
                        encontrado = true;
                        System.out.println("Valor encontrado na posicao [" + i + "][" + j + "]");
                    }
                }
            }

            if (!encontrado) {
                System.out.println("Valor nao encontrado na matriz.");
            }
        }
    }
}
