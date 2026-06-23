public class SubConjunto {
    
    public static void main(String[] args) {
        
        int [] A = {1, 2, 4};
        int [] B = {1, 2, 3, 4, 5, 6};

        // A é subconjunto de B ?

        // todos os elementos de A devem estar dentro de B
        // percorrendo todos os valores/elementos de A. para cada um dos valores A, compara com TODO B (percorrendo todo o vetor B)
        // nao sera subconjunto quando pelo menos 1 elemento de A nao estiver presente em B.
        boolean subconjunto = true;
        for (int i = 0; i < A.length; i++) {
            // int a = A[i];
            boolean encontrado = false;
            for (int j = 0; j < B.length; j++) {
                // if (a == B[j]) {
                if (A[i] == B[j]) {
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                subconjunto = false;
                break;
            }
        }

        System.out.println(subconjunto ? "SIM, eh subcojunto" : "NAO EH SUBCONJUNTO");
    }

}
