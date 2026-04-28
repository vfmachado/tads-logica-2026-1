import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        // mmc e mdc
        Scanner in = new Scanner(System.in);
        int a = 25;
        int b = 4;
        int c = 75;

        // MDC
        int mdc = 1;
        int cont = 2;

        while (cont <= a && cont <= b && cont <= c) {
            if (a % cont == 0 && b % cont == 0 && c % cont == 0) {
                mdc = cont;
            }
            cont++;
        }

        System.out.println("MDC " + mdc);

        int mmc = 111;
        cont = 2;
        while (true) {
            if (cont % a == 0 && cont % b == 0 && cont % c == 0) {
                mmc = cont;
                break;
            }
            cont++;
        }

        System.out.println("MMC " + mmc);
    }
}
