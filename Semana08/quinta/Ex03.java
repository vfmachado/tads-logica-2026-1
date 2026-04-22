package quinta;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        
        /*
            alt = 4
            larg = 7
            * * * * * * *
            *           *
            *           *
            * * * * * * * 
        */

        int altura = 10;
        int largura = 10;
        int x = 5;
        int y = 5;
        Scanner in = new Scanner(System.in);

        // repete tudo altura vezes
        while (true) {
            for (int alt = 1; alt <= altura; alt++) {
                // repete largura vezes
                for (int col = 1; col <= largura; col++) {
                    if (alt == y && col == x) {
                        System.out.print("# ");
                    }
                    else if (alt == 1 || alt == altura || col == 1 || col == largura) {
                        System.out.print("* ");    
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();    
            }
            System.out.println();

            char movimento = in.next().charAt(0);
            if (movimento == 'w') y--;
            if (movimento == 's') y++;
            if (movimento == 'a') x--;
            if (movimento == 'd') x++;

            System.out.println();
        }

        // for (int i = 0; i < altura; i++) {
        //     for (int j = 0; j < largura; j++) {
        //         System.out.print(i + "," +j +  "  " );
        //     }
        //     System.out.println();
        // }
    }
    
}
