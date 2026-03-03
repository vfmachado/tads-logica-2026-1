public class Tipos {
    
    public static void main(String[] args) {

        // declarando duas variaveis do tipo inteiro
        int a, b;

        // atribuicao  a variavel recebe o valor 10
        a = 10;
        // a variavel recebe o valor da variavel a vezes 2
        b = a * 2;

        // variavel =   ...
        // estamos alterando o valor valor da variavel

        //  ... = variavel 
        // AVALIANDO o valor da variavel
        a = a + 1;
        // a variavel a recebe o valor de a mais 1
                        // o texto "a = " concatenado com o valor da variavel
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // TIPOS
        /*
            cada tipo de dado serve o seu propósito, eles adicionam semantica.
            por exemplo, se eu pergunto a idade de alguem, normalmente, a resposta é um numero inteiro.
            // dd / MM / yyyy   3 variaveis inteiras

            int
            conjunto dos numeros inteiros -2bi até 2bi
            exemplos:
                idade, quantidades, tempo, distancia (cuidado).
        */

        a = 5;
        b = 3;
        int soma, subtracao, multiplicacao, divisao, resto;
        soma = a + b;   // 8
        subtracao = a - b;  // 2
        multiplicacao = a * b;  // 15
        divisao = a / b = 1;
        resto = a % b; // o quanto sobra da divisao  2

        // float = numeros reais (8 casas depois da virgula)
        float numeroReal = 3.141592f;   // força a conversao de um double para float
        float altura = 1.76f;
        float area, volume, comprimento, dinheiro, peso, medidas, velocidade;
        

    }

}