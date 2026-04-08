package segunda;
import java.util.Scanner;

public class ContagemParImpar {
    public static void main(String[] args) {
        
        // aplicacao que conte quantos numeros digitados pelo usuario sao pares e quanto sao impares, o programa termina quando o usuário informar um valor negativo
        /*
            0   2   1   5   7   3   4 -1
            p   p   i   i   i   i   p  x     
            3 pares 
            4 impares
        */
        Scanner in = new Scanner(System.in);
        int pares = 0, impares = 0;
        int numero = 0;

        while (numero >= 0) {
            numero = in.nextInt();
            if (numero >= 0) {
                if (numero % 2 == 0) pares++;
                else impares++;
            }
        }

        System.out.println("PARES " + pares);
        System.out.println("IMPARES " + impares);
    }
}
