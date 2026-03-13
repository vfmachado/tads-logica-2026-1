import java.util.Scanner;

public class Condicionais {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a, b, c;
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();

        // mostrar os tres numeros em ordem crescente
        // a menor b E b menor c  => se for true / ordem a, b, c
        if (a < b && b < c) {
            System.out.println(a + ", " + b + ", " c);
        }

        if (a < b && c < b) {
            System.out.println(a + ", " + c + ", " b);
        }

        if (b < a && a < c) {
            System.out.println(b + ", " + a + ", " c);
        }

        if (b < c && c < a) {
            System.out.println(b + ", " + c + ", " a);
        }

        if (c < a && a < b) {
            System.out.println(c + ", " + a + ", " b);
        }

        if (c < b && b < a) {
            System.out.println(c + ", " + b + ", " a);
        }

    }
}