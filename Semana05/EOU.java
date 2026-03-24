public class EOU {
    public static void main(String[] args) {
        
        boolean tf;
        int a = 5;
        int b = 20;

        // intervalo ( 0 <= x <= 10)  0 <= x && x <= 10
        if (a >= 0 && a <= 10) {
            // testando o intervalo [0, 10]
        }

        // fora do intervalo (x < 0 ou x > 10)
        if (a < 0 || a > 10) {
            // fora do intervalo [0, 10]   (-inf, 0)U(10, +inf)
        }

        // E + OU ?
        tf = a < b && a > 0; // E
        tf = a < b || a > 0; // OU

        // a = 5, b = 20
        tf = (a > b && a % 2 == 0) || b % 2 == 0;
        //     f    &&    f
        //          f             ou   v
        //                         v
    }
}