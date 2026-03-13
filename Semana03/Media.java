import java.util.Scanner;
public class Media {
    public static void main(String[] args) {

        // 1. FAÇA UM PROGRAMA QUE DADO DOIS VALORES DO TIPO FLOAT, CALCULE E MOSTRE A MEDIA DESTES VALORES.

        Scanner in = new Scanner(System.in);
        float v1, v2, media, soma; 

        System.out.println("Informe os dois valores");
        v1 = in.nextFloat();
        v2 = in.nextFloat();

        // soma = v1 + v2;
        // media = soma/2;
        media = (v1 + v2)/2;

        System.out.println("Media = " + media);


        // 2. EXTENDA O EXERCICIO ANTERIOR SOLICITANDO QUE O USUARIO INDIQUE O PESO DE CADA VALOR

    }
}