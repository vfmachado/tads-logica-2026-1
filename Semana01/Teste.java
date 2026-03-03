// os imports acontecem antes de tudo
// importar o scanner para utilizar no meu codigo
import java.util.Scanner;

// nome da classe é exatamente igual ao nome do arquivo (sem o .java)
public class Teste {
    // main => principal
    // ponto de partida de execucao do meu codigo
    // e todo nosso codigo fonte será escrito dentro do main
    public static void main(String[] args) {
    //  v                v       v         v
        Scanner in = new Scanner(System.in);
    
    // variaveis
        // declaracao de variavel
        // tipo e nome
        String texto;

        // NOSSO CODIGO
    //  v                  v                             v v
        System.out.println("Qual o seu nome?");
        // as instrucoes terminam com ; (ponto e virgula)
        // textos da instrucao de imprimir sao com aspas duplas

        // nome da variavel recebe a proxima palavra da entrada (scanner)
        texto = in.next();

        System.out.println("BEM VINDO(A) " + texto);
    }
}