package segunda;

public class Repeticao {
    public static void main(String[] args) {
        
        // ALGORITMO - SEQUENCIA BEM DEFINIDA E ESTRUTURADA QUE RESOLVE O MEU PROBLEMA
        // POR PADRAO A SEQUENCIA É LINHA DEPOIS DE LINHA

        // ESTRUTURAS DE CONTROLE CONDICIONAL - IF/ELSE
        // PERMITEM QUE A GENTE ESCOLHA BASEADO EM UM VALOR LOGICO (BOOLEAN) QUANDO UM BLOCO É EXECUTADO OU NAO

        /*
            int a = in.nextInt();
            if (a >= 7) {
                System.out.println("OK");
            } else {
                System.out.println("NOK");
            }
        */

        // ESTRUTURAS DE CONTROLE DE REPETICAO - PERMITEM QUE EU EXECUTE O MESMO BLOCO DE CÓDIGOS VARIAS VEZES. 
        /*
            WHILE (CONDICAO) {
                BLOCO
            }
            ENQUANTO A CONDICAO FOR VERDADEIRA EXECUTA O BLOCO DE CODIGO. QUANDO CHEGA NO FINAL, VOLTA PARA O TESTE E EXECUTA NOVAMENTE.

            SE MINHA CONDICAO FOR SEMPRE VERDADEIRA -> LAÇO INFINITO
                * no caso de erro, eu posso forçar a parada de um programa no terminal com CTRL+C
            SE MINHA CONDICAO NAO FOR INICIALMENTE VERDADEIRA -> O LAÇO NÃO É EXECUTADO

            OBJETIVO É CONTROLAR A CONDICAO ENQUANTO EU EXECUTO O LAÇO
        */

        int numero = 0;         // o laço executa enquanto numero for menor que 10.
        while (numero < 10) {   // quando o numero for maior ou igual a 10 o laço não é executado
            System.out.println(numero);   
            numero++;
        }

    }
}
