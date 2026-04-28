import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 1;

        while (n > 0) {
            n = in.nextInt();

            // 1 x 1 , 2x2 , 3x3 ... m x m >= n
            int mult = 1;
            while (mult * mult <  n) {
                mult++;
            }
            
            if (mult * mult == n) {
                System.out.println("QUADRADO PERFEITO");
            } else {
                System.out.println("NAO EH");
            }

        }
    }
}
