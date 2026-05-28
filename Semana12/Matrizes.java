

public class Matrizes {
    
    public static void main(String[] args) {

        // antes
        int [] v = new int[10];

        // mais dimensoes representadas nos colchetes
        int [][] matriz = new int[10][10];

        int [][][] mat3D = new int[10][10][10];
        int [][][][] mat4D;

        // PIXELS DA TELA
        // 1920 X 1080 = 2073600 pixels
        int [][] tela = new int[1080][1920];

        // aqui estamos estanciando apenas as linhas da matriz
        int [][] M = new int[10][];

        // UMA MATRIZ É UM VETOR DE VETORES
        // + CADA LINHA MATRIZ É UM VETOR INDEPENDENTE, OU SEJA, CADA UM PODE TER UM TAMANHO DIFERENTE
        /*
            X   X
            X   X   X   X
            X   X   X
            X

            int [][] m = new int[4][];
            m[0] = new int[2];      // a linha 0 da matriz tem tamanho 2
            m[1] = new int[4];      // a linha 1 da matriz tem tamanho 4
            m[2] = new int[3];      // a linha 2 da matriz tem tamanho 3
            m[3] = new int[1];      // a linha 3 da matriz tem tamanho 1
    
        */

        int [] v1 = { 10, 20, 30, 40};
        int [][] m1 = {
            {10, 20, 30, 40},
            {50, 60, 70, 80},
            {90, 100, 110, 120}
        };


        /*
            onde matrizes sao usadas?
                jogos de tabuleiro
                pixels da tela
                desenhos bidimensionas (jogos do supernintendo, mario, rpgmaker)
                tabelas no geral
                mapas
                grids de interface grafica
        */
       

    }
}