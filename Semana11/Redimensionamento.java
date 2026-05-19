
public class Redimensionamento {

    public static void main(String[] args) {
        
        int [] v1 = new int[10];
        int [] v2 = {1, 2, 3, 4, 5};

        int tam = 10;
        int [] v3 = new int[tam];


        int [] precos = {10, 20, 30, 40, 50, 60, 70, 80};

        // preciso adicionar mais precos nesse vetor
        int [] tmp = new int[precos.length + 10]; // 8 + 10 = 18
        for (int i = 0; i < precos.length; i++) {
            tmp[i] = precos[i];
        }
        precos = tmp; // troca de ponteiro

        tmp[10] = 99;

        for (int i = 0; i < precos.length; i++) {
            System.out.println(precos[i]);
        }

    }

}