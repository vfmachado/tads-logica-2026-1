import java.util.Scanner;

// javac Soma.java
// java Soma

public class Soma {
    public static void main(String[] args) {
        // FAÇA UM PROGRAMA QUE SOME DOIS NUMEROS INTEIROS ESCOLHIDOS PELO USUARIO, MOSTRE A MULTIPLICACAO ENTRE ELES
        
        // FACA UM PROGRAMA QUE DADO UM NUMERO CALCULE SEU ANTECESSOR E SEU SUCESSOR

        // FACA UM NUMERO QUE CONVERA UM QUANTIDADE DE DOLARES PARA REAL (5)

        Scanner in = new Scanner(System.in);
        int a, b, c;

        System.out.println("Digite 2 numeros inteiros");
        a = in.nextInt();
        b = in.nextInt();
        c = a + b;
        System.out.println("C = " + c);
    }
}