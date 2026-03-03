import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int valorInteiro;
        float valorFloat;
        double valorDouble;
        String texto;

        System.out.println("Digite um valor inteiro");
        valorInteiro = in.nextInt();        // Int() acompanha o tipo da variavel

        System.out.println("Digite um valor float");
        valorFloat = in.nextFloat();

        System.out.println("Digite um valor double");
        valorDouble = in.nextDouble();

        System.out.println("Digite uma palavra (nome)");
        texto = in.next();  // next sem nada

        System.out.println("VC DIGITOU:");
        System.out.printf("INTEIRO = %d\nFLOAT = %f\nDOUBLE = %f\nTEXTO = %s\n", valorInteiro, valorFloat, valorDouble, texto);
    }
}