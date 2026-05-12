import java.util.Random;
import java.util.Scanner;

public class Vetores03 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        // REFERENCIA POSICIONAL
        // EH RUIM, EH PESSIMO, A GENTE NAO USA EXCETO PARA ESTUDAR/APRENDER

        // RELACIONAR DADOS BASEADO NA POSICAO
        String [] alunos = new String[5];
        float [] notas = new float[5];

        System.out.println("informe o nome e a nota de cada aluno");
        for (int i = 0; i < notas.length; i++) {
            alunos[i] = in.nextLine();
            notas[i] = in.nextFloat(); in.nextLine();
        }

        for (int i = 0; i < notas.length; i++) {
            System.out.println(alunos[i] + " - NOTA " + notas[i]);
        }

        // qual o nome do aluno que tirou a maior nota?
        /*
            descobrir a maior nota
            identifico a posicao da nota
            busco o nome com a posicao
        */
        int posMaior = 0;
        for (int i = 1; i < notas.length; i++) {
            if (notas[i] > notas[posMaior]) {
                posMaior = i;
            }
        }
        System.out.println("MAIOR NOTA DO(A) ALUNO(A): " + alunos[posMaior]);
    }
}
