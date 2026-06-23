# 0. Entrega da lista final completa + Arguição

Ao invés de selecionar um dos exercícios abaixo. Os alunos podem optar por fazerem toda a lista final e apresentar códigos a escolha do professor.


---

# 1. Jogo 2048 simplificado

## Descrição

Crie uma versão simplificada do jogo **2048** usando uma matriz `4x4`.

O programa deve iniciar com alguns valores já definidos na matriz, por exemplo:

```text
2   0   0   2
0   4   0   0
0   0   2   0
0   0   0   0
```

O usuário deve escolher uma direção para mover os números:

```text
W - cima
S - baixo
A - esquerda
D - direita
```

Após o movimento, os números devem ser deslocados e, quando dois valores iguais se encontrarem, devem ser somados.

## Regras obrigatórias

O aluno deve implementar:

1. Matriz `4x4`;
2. Exibição do tabuleiro;
3. Leitura da direção;
4. Movimento dos números;
5. Soma de números iguais;
6. Contador de pontos;
7. Verificação se o jogador chegou ao número `2048`, ou a uma meta menor, como `64` ou `128`.

## Versão simplificada (vale menos)

Para uma avaliação inicial, pode-se limitar o exercício ao movimento em apenas uma direção, por exemplo:

```text
Mover apenas para a esquerda.
```

Depois, como desafio, o aluno pode implementar as quatro direções.

## Exemplo de entrada

```text
Digite o movimento: A
```

## Exemplo de saída

Antes:

```text
2   0   0   2
0   4   0   0
0   0   2   2
0   0   0   0
```

Depois:

```text
4   0   0   0
4   0   0   0
4   0   0   0
0   0   0   0
```

## Pontos para arguição

O professor pode perguntar:

1. Como você percorreu a matriz para mover os valores?
2. Por que o movimento para a esquerda é diferente do movimento para a direita?
3. Como você evita somar o mesmo número mais de uma vez?
4. Como o programa identifica uma posição vazia?
5. Como você calcularia se ainda existem movimentos possíveis?


---

# 2. Validador de Sudoku

## Descrição

Crie um programa que receba uma matriz `9x9` representando um Sudoku preenchido e verifique se a solução é válida.

O programa deve validar:

1. Linhas;
2. Colunas;
3. Blocos `3x3`.

## Exemplo de matriz válida

```text
5 3 4 6 7 8 9 1 2
6 7 2 1 9 5 3 4 8
1 9 8 3 4 2 5 6 7
8 5 9 7 6 1 4 2 3
4 2 6 8 5 3 7 9 1
7 1 3 9 2 4 8 5 6
9 6 1 5 3 7 2 8 4
2 8 7 4 1 9 6 3 5
3 4 5 2 8 6 1 7 9
```

## Regras obrigatórias

O aluno deve verificar se:

1. Todos os números estão entre `1` e `9`;
2. Nenhuma linha possui número repetido;
3. Nenhuma coluna possui número repetido;
4. Nenhum bloco `3x3` possui número repetido;
5. Ao final, exibir se o Sudoku é válido ou inválido.

## Saída esperada

```text
Sudoku válido.
```

ou

```text
Sudoku inválido.
Erro encontrado na linha 4.
```

## Variação mais simples (vale menos)

Em vez de validar o Sudoku inteiro, o aluno pode validar apenas:

```text
Uma linha, uma coluna e um bloco 3x3 escolhido pelo usuário.
```

## Pontos para arguição

O professor pode perguntar:

1. Como você verificou números repetidos em uma linha?
2. Como você percorreu uma coluna usando matriz?
3. Como localizar o início de um bloco `3x3`?
4. Por que uma matriz `9x9` é adequada para representar o Sudoku?
5. Como você tratou valores fora do intervalo de `1` a `9`?



---

# 3. Damas simplificado

## Descrição

Crie uma versão simplificada do jogo de **Damas** usando uma matriz `8x8`.

Cada posição da matriz representa uma casa do tabuleiro.

Sugestão de representação:

```text
0 = casa vazia
1 = peça do jogador 1
2 = peça do jogador 2
```

Exemplo:

```text
0 2 0 2 0 2 0 2
2 0 2 0 2 0 2 0
0 2 0 2 0 2 0 2
0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0
1 0 1 0 1 0 1 0
0 1 0 1 0 1 0 1
1 0 1 0 1 0 1 0
```

## Regras obrigatórias

O programa deve permitir:

1. Exibir o tabuleiro;
2. Escolher uma peça pela linha e coluna;
3. Escolher a posição de destino;
4. Validar se a peça pertence ao jogador da vez;
5. Validar se o movimento é diagonal;
6. Validar se a posição de destino está vazia;
7. Alternar a vez entre jogador 1 e jogador 2.

## SIMPLIFICAÇÕES

Não precisa implementar dama promovida. Também não precisa obrigar captura.

O movimento pode ser apenas:

```text
Jogador 1 move para cima.
Jogador 2 move para baixo.
```

## Pontos para arguição

O professor pode perguntar:

1. Como você representou as peças na matriz?
2. Como você verifica se o movimento é diagonal?
3. Como você garante que o jogador não mova peça adversária?
4. Como você alterna a vez dos jogadores?
5. Como você faria para implementar a captura?
6. Como você verificaria o fim do jogo?



---

# 4. Batalha Naval

## Descrição

Crie um jogo de **Batalha Naval** usando uma matriz `10x10`.

O programa deve possuir uma matriz com os navios escondidos e outra matriz visível para o jogador.

Sugestão:

```java
int[][] tabuleiro = new int[10][10];
int[][] visual = new int[10][10];
```

Representação:

```text
0 = água
1 = navio
2 = tiro na água
3 = tiro acertou navio
```

## Regras obrigatórias

O programa deve:

1. Criar uma matriz `10x10`;
2. Posicionar navios manualmente ou por valores fixos;
3. Pedir ao usuário uma linha e uma coluna para atirar;
4. Informar se acertou ou errou;
5. Marcar o tiro na matriz;
6. Impedir tiro repetido;
7. Contar quantidade de tiros;
8. Contar quantidade de acertos;
9. Encerrar quando todos os navios forem atingidos.

## Exemplo de interação

```text
Digite a linha do tiro: 2
Digite a coluna do tiro: 4

Você acertou um navio!
```

Matriz visual:

```text
0 0 0 0 0
0 0 0 0 0
0 0 0 0 X
0 0 0 0 0
0 0 0 0 0
```

## Versão simplificada (vale menos)

Usar matriz `5x5` com 3 navios de tamanho 1.

## Versão intermediária

Usar matriz `10x10` com:

```text
1 navio de tamanho 4
2 navios de tamanho 3
3 navios de tamanho 2
4 navios de tamanho 1
```

## Pontos para arguição

O professor pode perguntar:

1. Por que você usou duas matrizes?
2. Como você impede que o jogador veja os navios?
3. Como você verifica tiro repetido?
4. Como você conta os acertos?
5. Como você validou se a linha e a coluna estão dentro da matriz?
6. Como seria possível posicionar navios aleatoriamente?



# Critérios de avaliação

| Critério                                  | Peso |
| ----------------------------------------- | ---: |
| Uso correto de matriz                     |  2,0 |
| Validação de entrada                      |  1,0 |
| Aplicação correta das regras do problema  |  3,0 |
| Clareza da lógica e organização do código |  2,0 |
| Apresentação e explicação oral            |  2,0 |
