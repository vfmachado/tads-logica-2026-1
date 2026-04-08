package segunda;

public class Somatorio {
    public static void main(String[] args) {
        
        // SOMAR OS NUMEROS PARES DE 0 A N
        /*
            n = 10
            2 + 4 + 6 + 8 + 10

            n = 4
            2 + 4

            n = 20
            2 + 4 + 6 + 8 + 10 + 12 + 14 + 16 + 18 + 20
        */
        int n = 10;     
        int soma = 0;   // somatorios começam em zero       // multiplicacoes começam com 1
        int numero = 2;

        while (numero <= n) {
            soma = soma + numero;

            System.out.println("somando " + numero);
            System.out.println("soma " + soma);

            numero = numero + 2;        // numero += 2;
        }

    }
}
