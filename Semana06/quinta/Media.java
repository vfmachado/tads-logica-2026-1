package quinta;
import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        
        // CALCULAR A MEDIA DE 5 VALORES VALIDOS, VALORES VALIDOS SAO NUMEROS DENTRO DO INTERVALO [0, 10]. CASO O VALOR SEJA INVALIDO, O USUARIO DEVE DIGITAR NOVAMENTE ATÉ QUE 5 VALORES VALIDOS SEJAM DIGITADOS

        Scanner in = new Scanner(System.in);
        int validos = 0;
        float valor, soma = 0, media;
        while (validos != 5) {
            valor = in.nextFloat();
            if (valor  >= 0 && valor <= 10) {
                validos++;
                soma = soma + valor;
            }
            System.out.println("numero de valores validos: " + validos);
            System.out.println("SOMA ATUAL " + soma);
        }

        media = soma / 5;
        System.out.println("MEDIA " + media);
    }
}
