
public class Variaveis {
    public static void main(String[] args) {

        // variaveis do tipo inteiro
        // nomes a, b, c
        int a;
        int b, c;

        // quando a variavel está a esquerda, estamos associando um valor a ela
        a = 1;
        b = 2;
        // c recebe o valor avaliado de a + b
        c = a + b;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        a = 15;
        b = a + c;      // 18

        System.out.println("a = " + a);
        System.out.println("c = " + c);
        System.out.println("b = a+c = " + b);
    }
}