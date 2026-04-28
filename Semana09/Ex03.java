public class Ex03 {
    public static void main(String[] args) {
        
        for (int num = 100; num <= 999; num++) {
            int c, d, u;

            c = num / 100;
            d = (num % 100)/10;
            u = num % 10;

            if ((c + 1 == d && d + 1 == u) ||
               (c - 1 == d && d - 1 == u)) {
                int mult = c * d * u;
                System.out.printf("%d x %d x %d = %d\n", c, d, u, mult);
            }
        }
    }    
}
