import java.util.Scanner;

public class VelhaComMatriz {
    public static void main(String[] args) {
        
        char [][] m = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
        };

        Scanner in = new Scanner(System.in);
        char jogador = 'O';

        while (true) {
            int jogada = in.nextInt();
            // transforma a jogada em coordenadas da matriz
            int linha = jogada / 3; // linha é o resultado da divisao inteira da jogada por 3
            int coluna = jogada % 3; // coluna é o resultado do resto da divisao da jogada por 3

            if (m[linha][coluna] == ' ') {
                m[linha][coluna] = jogador;
            }

             // verifica o ganho
             for (int i = 0; i < m.length; i++) {
                // linha
                if (m[i][0] == jogador && m[i][1] == jogador && m[i][2] == jogador) {
                    System.out.println("Jogador " + jogador + " ganhou!");
                    return;
                }
                // coluna
                if (m[0][i] == jogador && m[1][i] == jogador && m[2][i] == jogador) {
                    System.out.println("Jogador " + jogador + " ganhou!");
                    return;
                }
             }
             // diagonais
            if (m[0][0] == jogador && m[1][1] == jogador && m[2][2] == jogador) {
                System.out.println("Jogador " + jogador + " ganhou!");
                return;
            }

            if (m[0][2] == jogador && m[1][1] == jogador && m[2][0] == jogador) {
                System.out.println("Jogador " + jogador + " ganhou!");
                return;
            }

             // troca o jogador
             if (jogador == 'O') {
                jogador = 'X';
             } else {
                jogador = 'O';
             }
        }
    }
}
