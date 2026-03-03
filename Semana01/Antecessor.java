import java.util.Scanner;

public class Antecessor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero, antecessor, sucessor;

        System.out.println("digite um numero");
        numero = in.nextInt();
        antecessor = numero - 1;
        sucessor = numero + 1;
        System.out.println("antecessor = " + antecessor);
        System.out.println("sucessor = " + sucessor);
    }
}