package quinta;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i = 1;
        int soma = 0;

        while (i <= n) {
            System.out.println(i);
            soma = soma + i;
            i++;    // 2, 3, 4, 5, ... > n
        }

        System.out.println(soma);
    }

}