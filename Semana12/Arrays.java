
public class Arrays {
    public static void main(String[] args) {

        int [] a = new int[10];
        int b [] = new int[10];
        
        // cuidado
        int c, d [];  // apenas d é um vetor.
        int [] e, f;  // ambos sao vetores

        // sugestao é declarar um vetor de cada vez =)

        /*
            tamanho é diferente de posicao
            valor é diferente de posicao

            referencia as posicoes do vetor para chegar no valor
            vetor na posicao y
            vetor[y] = valor

            como todas as interacoes acontecem posicao por posicao, sempre ao avaliar/buscar/colocar valores a operacao é feita a partir de um laço de repeticao.

        */

        int [] g = {10, 20, 30, 40, 50};

        for (int i = 0; i < g.length; i++) {
            System.out.println(g[i]); // mostrando o valor do vetor na posicao i
        }

        // DICA SE PRECISAR COMPARAR OS VALORES ENTRE SI DE UM VETOR (E TODOS COM TODOS)
        // VC TORNOU O PROBLEMA BIDIMENSIONAL - POR CONTA DISSO PRECISAMOS DE DOIS FORS PARA RESOLVER

        // EX: ORDENACAO, VALOR QUE COMPLEMENTA
        // FACA UM PROGRAMA QUE INDIQUE QUAIS DUAS POSICOES TEM OS VALORES QUE SOMADOS RESULTEM NUM VALOR X ESCOLHIDO PELO USUARIO

        // [10, 5, 3, 15, 18, 7, 2, 1, 20, 8]  -> esse cai na avaliacao
        // SOMA DE DOIS ELEMENTOS RESULTA EM 25
        // 10 + 15
        // 18 + 7
        // 5 + 20

    }
}