import java.util.Scanner;
public class Notas {

    public static void main(String[] args) {

        // FAÇA UM PROGRAMA QUE LEIA UM VALOR INTEIRO REPRESENTANDO A QUANTIDADE QUE UM CLIENTE GOSTARIA DE SACAR EM UM CAIXA ELETRONICO.
        // POR EXEMPLO, 170 REAIS.
        // O PROGRAMA DEVE ENTREGAR COMO RESULTADO A QUANTIDADE DE NOTAS DE 50, 10 2 NECESSARIAS PARA COMPOR O VALOR. CONSIDERANDO A MENOR QUANTIDADE DE NOTAS POSSIVEL.
        // CONSIDERE QUE O USUARIO/CLIENTE NAO VAI DIGITAR UM VALOR IMPOSSIVEL (IMPAR POR EXEMPLO)

        // 170
        // 3 NOTAS DE 50
        // 2 NOTAS DE 10

        // 254
        // 5 NOTAS DE 50
        // 0 NOTAS DE 10
        // 2 NOTAS DE 2
        Scanner in = new Scanner(System.in);
        int valor = 0, n50, n10, n2;

        System.out.println("Quanto deseja sacar?");
        valor = in.nextInt();

        System.out.println("DIGITOU " + valor);
        n50 = valor / 50;
        // System.out.println(n50 + " notas de 50");
        
        // quanto sobrou? 
        // int sobrou = valor - n50 * 50;
        int sobrou = valor % 50;

        n10 = sobrou / 10;
        // sobrou = sobrou % 10;
        sobrou = sobrou - n10 * 10;

        n2 = sobrou / 2;
        // System.out.println("Sobrou " + sobrou);
        System.out.println(n50 + " de 50");
        System.out.println(n10 + " de 10");
        System.out.println(n2 + " de 2");
    }
}