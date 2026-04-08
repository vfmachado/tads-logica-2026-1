package quinta;
public class Contando {
    public static void main(String[] args) {
        
        int x = 0;
        while (x <= 20) {
            System.out.println(x);
            x = x + 2;
        }
        System.out.println();

        int inicio, fim, salto;

        inicio = 0;
        fim = 20;
        salto = 2;

        while (inicio <= fim) {
            System.out.println(inicio);
            inicio = inicio + salto;
        }
        System.out.println();

       
        x = 19;
        while (x >= 1) {
            System.out.println(x);
            x = x - 2;
        }
        System.out.println();

        inicio =19;
        fim = 1;
        salto = -2;

        while (inicio >= fim) {
            System.out.println(inicio);
            inicio = inicio + salto;
        }
        
    }
}
