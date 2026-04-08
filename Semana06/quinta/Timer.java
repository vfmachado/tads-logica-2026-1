package quinta;
public class Timer {
    public static void main(String[] args) throws Exception {
        
        int tempo = 0;
    
        // na hora de rodar
        // java Timer 10
        // args[0] vai ser a primeira Strig do lado do nome do programa
        // Integer.parseInt transforma a String em int
        if (args[0] != null) {
            tempo = Integer.parseInt(args[0]);
        }
        
        while (tempo > 0) {
            System.out.println(tempo);
            tempo--;
            Thread.sleep(1000);
        }

        // MOSTRAR OS NUMEROS PARES DE 0 A 20
        // MOSTRAR OS NUMEROS IMPARES DE 20 A 0
        // MOSTRAR OS NUMEROS DE 1 A 100 SENDO QUE QUANDO O NUMERO FOR MULTIPLO DE 3 MOSTRAR A PALAVRA FIZZ, QUANDO FOR MULTIPLO DE 5 MOSTRAR A PALABRA BUZZ E QUANDO FOR MULTIPLO DE 3 E 5 MOSTRAR FIZZBUZZ
        /*
        int n = 10;
        int x = 1;
        while (x <= n) {
            System.out.println(x);
            x++;    // x = x + 1
        }
        */
    }
}
