import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int num = 0;
        int somaPares = 0, somaImpares = 0;
        int quantPares = 0, quantImpares = 0;
        int maiorPar = 0;
        int menorImpar = Integer.MAX_VALUE;  // -1   ou  99999999
        while (true) {
            num = in.nextInt();
            if (num < 0) {
                break;
            }

            if (num % 2 == 0) {
                somaPares = somaPares + num;
                quantPares++;

                if (num > maiorPar) {
                    maiorPar = num;
                }
            } else {
                somaImpares = somaImpares + num;
                quantImpares++;

                if (menorImpar > num) {
                    menorImpar = num;
                }
            }
        }

        float mediaPares = (float) somaPares / quantPares;
        System.out.println("MEDIA PARES " + mediaPares);
        System.out.println("MAIOR PAR " + maiorPar);

        float mediaImpares = (float) somaImpares / quantImpares;
        System.out.println("MEDIA IMPPARES " + mediaImpares);
        System.out.println("MENOR IMPAR " + menorImpar);
        
    }    
}
