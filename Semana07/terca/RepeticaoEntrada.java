package segunda;

import java.util.Scanner;

public class RepeticaoEntrada {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        String senha = "java";
        String digitado = "";
        int tentativas = 0; 
        
        // a condicao depende do que o usuario digitou
        while (!digitado.equals(senha)) {
            System.out.println("informe a senha");
            digitado = in.next();
            tentativas++;    // contagem
        }

        System.out.println("ACERTOU COM " + tentativas + " TENTATIVAS");
    }
}
