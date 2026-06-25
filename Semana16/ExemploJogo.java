import java.util.Scanner;

public class ExemploJogo {

    public static void main(String[] args) {
        
        int[][] m = new int[8][8];
        int jogador = 1;
        int pt1 = 0, pt2 = 0;

        /*
            EH UM JOGO QUE JOGADORES FICAM COLOCANDO PEÇAS NO TABULEIRO, LUGARES OCUPADOS NAO PODEM SER SOBREPOSTOS.

            PEÇAS ADJACENTES SOMAM A PONTUACAO EM LINHA E COLUNA
        
        
        */

        // um jogo fica dentro de um grande laco de repeticao
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("\n\n === J1 " + pt1 + " x " + pt2 + " J2 ===");
            // mostra o tabuleiro
            for (int i = 0; i < m.length; i++) {
                for (int j = 0; j < m[i].length; j++) {
                    System.out.print(m[i][j] + "  ");
                }
                System.out.println();
            }
            // recebe uma jogada valida
            int linha = 0;
            int coluna = 0;
            System.out.println("jogador " + jogador);
            do {
                System.out.println("escolha uma linha e coluna validas (1 a 8)");
                linha = in.nextInt() -1;
                coluna = in.nextInt() -1;
                
                if (linha < 0 || linha > 7) continue;
                if (coluna < 0 || coluna > 7) continue;
                if (m[linha][coluna] != 0) continue;

                break;
            } while (true);

            System.out.println("POSICAO RECEBIDA " + linha + ", " + coluna);

            // atualiza tabuleiro e pontuacao
            m[linha][coluna] = jogador;

            // pontuacao xD

            // precisamos verificar na posicao linha e coluna as casas adjacentes para ir somando a pontuacao toda vez em que encontro um igual.
            int lin = linha;
            // linha diminuindo
            while (lin > 0) {
                lin--;
                if (m[lin][coluna] != jogador) {
                    break;
                }
                if (jogador == 1) pt1++;
                else pt2++;
            }

            // troca o jogador
            // jogador = jogador == 1 ? 2 : 1;
            if (jogador == 1) {
                jogador = 2;
            } else {
                jogador = 1;
            }
        }        
    }

}
