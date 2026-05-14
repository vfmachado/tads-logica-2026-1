import java.util.Scanner;
public class Exercicio {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] v = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        while (true) {
            System.out.println(
                "0. Preencher todo o vetor\n" +
                "1. Mostrar vetor\n" +
                "2. Colocar um valor em uma posicao\n" +
                "3. Trocar os valores de duas posicoes\n" +
                "4. Encontrar o maior valor e sua posicao\n" +
                "5. Encontrar o menor valor e sua posicao\n" +
                "6. Calcular a media do vetor\n" +
                "7. Fazer o deslocamento dos zeros para o final do vetor\n" +
                "8. Calcular o desvio padrao\n" +
                "9. Ordenar o vetor\n" +
                "-1. SAIR");
            int opcao = in.nextInt();
            if (opcao == -1) {
                break;
            }
            switch (opcao) {
                case 0:
                    System.out.println("informe os valores");
                    for (int i = 0; i < v.length; i++) {
                        v[i] = in.nextInt();
                    }
                    break;
                case 1:
                    for (int i = 0; i < v.length; i++) {
                        System.out.println("POSICAO: " + i + " VALOR: " + v[i]);
                    }
                    break;
                case 2:
                    System.out.println("POSICAO e VALOR: ");
                    int posicao = in.nextInt();
                    int valor = in.nextInt();
                    v[posicao] = valor; // vetor na posicao recebe valor
                    break;
                case 3:
                    // le duas posicoes e troca os valores
                    System.out.println("informe duas posicoes 0-9");
                    int a = in.nextInt();
                    int b = in.nextInt();
                    int tmp = v[a];
                    v[a] = v[b];
                    v[b] = tmp;
                    break;
                case 6:
                    // media dos valores do vetor;
                    break;
                
                case 7:
                // "7. Fazer o deslocamento dos zeros para o final do vetor\n" +
                    int [] aux = new int[10];
                    int j = 0;
                    for (int i = 0; i < v.length; i++) {
                        if (v[i] != 0) {
                            aux[j] = v[i];
                            j++;
                        }
                    }
                    v = aux;    // altera o ponteiro do vetor para o aux
                    break;
                
                case 8:
                // "8. Calcular o desvio padrao\n" +
                    break;

                case 9:
                // "9. Ordenar o vetor\n" +
                    break;
            }
        }
    }
}
