import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tamanho = in.nextInt();
        
        // declaracao
        float [] notas;

        // inicializacao
        notas = new float[tamanho];

        // declaracao e inicializacao
        String [] nomes = new String[5];


        for (int i = 0; i <  notas.length; i++) {
            notas[i] = in.nextFloat();
        }

        // .length => retorna o tamanho do vetor
        for (int i = 0; i < notas.length; i++) {
            System.out.println(i + " => " + notas[i]);
        }
        
        
    }
}
