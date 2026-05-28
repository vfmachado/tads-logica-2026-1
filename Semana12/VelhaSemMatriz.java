import java.util.Scanner;

public class VelhaSemMatriz {
    public static void main(String[] args) {
        
        char p0, p1, p2, p3, p4, p5, p6, p7, p8;
        char jogador = 'O';
        Scanner in = new Scanner(System.in);

        p0 = p1 = p2 = p3 = p4 = p5 = p6 = p7 = p8 = ' ';

        while (true) {
            System.out.println(" " + p0 + " | " + p1 + " | " + p2);
            System.out.println("---+---+---");
            System.out.println(" " + p3 + " | " + p4 + " | " + p5);
            System.out.println("---+---+---");
            System.out.println(" " + p6 + " | " + p7 + " | " + p8);

            // aqui o jogador escolhe a posicao onde quer jogar
            // e o programa atribui o valor do jogador a posicao escolhida
            // depois disso, o programa verifica se o jogador ganhou ou empatou
            // e se nao, troca o jogador para a proxima rodada  

            char posicao = in.next().charAt(0);
            
            if (posicao == '0' && p0 == ' ') {
                p0 = jogador;
            } else if (posicao == '1' && p1 == ' ') {
                p1 = jogador;
            } else if (posicao == '2' && p2 == ' ') {
                p2 = jogador;
            } else if (posicao == '3' && p3 == ' ') {
                p3 = jogador;
            } else if (posicao == '4' && p4 == ' ') {
                p4 = jogador;
            } else if (posicao == '5' && p5 == ' ') {
                p5 = jogador;
            } else if (posicao == '6' && p6 == ' ') {
                p6 = jogador;
            } else if (posicao == '7' && p7 == ' ') {
                p7 = jogador;
            } else if (posicao == '8' && p8 == ' ') {
                p8 = jogador;
            }

            // verifica o ganho
                if ((p0 == jogador && p1 == jogador && p2 == jogador) ||
                    (p3 == jogador && p4 == jogador && p5 == jogador) ||
                    (p6 == jogador && p7 == jogador && p8 == jogador) ||
                    (p0 == jogador && p3 == jogador && p6 == jogador) ||
                    (p1 == jogador && p4 == jogador && p7 == jogador) ||
                    (p2 == jogador && p5 == jogador && p8 == jogador) ||
                    (p0 == jogador && p4 == jogador && p8 == jogador) ||
                    (p2 == jogador && p4 == jogador && p6 == jogador)) {
                    System.out.println("Jogador " + jogador + " ganhou!");
                    break;
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
