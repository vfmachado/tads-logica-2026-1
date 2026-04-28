public class Ex07 {
    public static void main(String[] args) {
        
        int n = 5;
        int espacos = 0;
        while (n > 0) {
            for (int e = 0; e < espacos; e++) {
                System.out.print("  ");
            }

            int asteriscos = n * 2 -1;
            for (int a = 0; a < asteriscos; a++) {
                System.out.print("* ");
            }
            System.out.println();

            n--;
            espacos++;
        }
    }
}
