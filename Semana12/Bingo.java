import java.util.Random;

public class Bingo {
    public static void main(String[] args) {
        
        // PREENCHA UMA MATRIZ 5X5 COM VALORES DE 1 A 60 DE MANEIRA ALEATORIA, SEM REPETICAO
        int [][] m = new int[5][5];
        
        // Utililidades.preencheAleatorio(m, 1, 60);
        Utililidades.mostraMatriz(m);

        // SORTEAR A MATRIZ TODA NAO É UMA SOLUCAO, POIS PODE HAVER REPETICAO DE NUMEROS JA QUE ESTAMOS SORTEANDO 25 NUMEROS EM 60 A COLISAO É MUITO PROVAVEL
        int [] vistos = new int[25];
        int qtdVistos = 0;

        Random r = new Random();
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                int sorteio = r.nextInt(60) + 1; // sorteia um numero entre 1 e 60

                // verificar se ele foi visto
                boolean jaTem = false;
                for (int k = 0; k < qtdVistos; k++) {
                    if (vistos[k] == sorteio) {
                        jaTem = true;
                        break;
                    }
                }

                if (jaTem) {
                    j--; // volta a coluna para tentar sortear outro numero
                } else {
                    m[i][j] = sorteio; // popula a matriz
                    vistos[qtdVistos] = sorteio; // marca o numero como visto
                    qtdVistos++;
                }
            }
        }

    }
}
