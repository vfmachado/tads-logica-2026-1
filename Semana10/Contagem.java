public class Contagem {
    public static void main(String[] args) {
        
        int [] v = { 1, 2, 3, 4, 5, 6, 7, 8, 9};

        // conte quantos valores sao pares e quantos sao impares
        // mostre todos os valores agrupados, primeiros os pares, depois os impares
        
        // contagem
        int pares = 0;
        int impares = 0;

        for (int i = 0; i < v.length; i++) {
            if (v[i] % 2 == 0) pares++;
            else impares++;
        }
        System.out.println("PARES " + pares);
        System.out.println("IMPARES " + impares);

        for (int i = 0; i < v.length; i++) {
            if (v[i] % 2 == 0) {
                System.out.println(v[i]);
            }
        }

        for (int i = 0; i < v.length; i++) {
            if (v[i] % 2 == 1) {
                System.out.println(v[i]);
            }
        }


    }
}
