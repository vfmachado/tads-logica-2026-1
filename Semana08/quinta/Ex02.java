package quinta;

public class Ex02 {
    public static void main(String[] args) {
        
        int linhas = 8;
        int asteriscos = linhas * 2 - 1;
        
        for (int linha = linhas; linha > 0; linha--) {
            for (int i = 0; i < asteriscos; i++) {
                System.out.print(" *");
            }
            System.out.println();
            linhas--;
            asteriscos = asteriscos -2;
        }

        linhas = 8;
        while (linhas > 0) {
            asteriscos = linhas * 2 - 1;
            for (int i = 0; i < asteriscos; i++) {
                System.out.print(" *");
            }
            System.out.println();
            linhas--;
        }

    }
}
