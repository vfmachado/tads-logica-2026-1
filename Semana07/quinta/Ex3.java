package quinta;

public class Ex3 {
    public static void main(String[] args) {
        
        int divisor = 2;
        int n = 180;

        while (n > 1) {
            if (n % divisor == 0) {
                System.out.println(divisor);
                n = n / divisor;
            } else {
                divisor++;
            }
        }

    }   
}
