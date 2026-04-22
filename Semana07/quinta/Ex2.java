package quinta;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();

        if (x < y) {
            while (x <= y) {
                System.out.println(x);
                x++;
            }
        } else {
            while (x >= y) {
                System.out.println(x);
                x--;
            }
        }

        // while (x != y) {
        //     System.out.println(x);
        //     if (x < y) x++;
        //     else x--;
        // }
        // System.out.println(x);
    }
}
